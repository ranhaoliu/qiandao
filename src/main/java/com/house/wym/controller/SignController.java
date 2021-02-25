package com.house.wym.controller;

import com.house.wym.entity.LessonKey;
import com.house.wym.entity.SignList;
import com.house.wym.entity.Student;
import com.house.wym.service.LessonKeyService;
import com.house.wym.service.SignService;
import com.house.wym.service.UserMessgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 23:01
 * 学生签到
 */
@RestController
public class SignController {
    @Autowired
    SignService signService;
    @Autowired
    UserMessgeService userMessgeService;
    @Autowired
    LessonKeyService lessonKeyService;
//****************************待做***********************************
@RequestMapping(value = "/saveSign" ,method = RequestMethod.POST)
public int savaSign(HttpServletRequest request){
    // $sql1 = "select * from lessonKey where lessonid = '$lessonid' order by keyid desc limit 1";


//    int keyid = Integer.parseInt(request.getParameter("keyid"));//keyid要从 数据库中加载
    int lessonid = Integer.parseInt(request.getParameter("id"));
    LessonKey lessonKey = lessonKeyService.getLessonKey(lessonid);
    String userid = request.getParameter("userid");
    Student student = userMessgeService.getStudentByUserId(userid);
    if(student ==null){
        return  -1;
    }
    String name = student.getName();
     String xuehao = String.valueOf(student.getXuehao());
     int ret = -2;
    if (lessonKey != null){
        // 查看是否签过到了 如果签到了就不再签到了，那个主键会只能唯一
        ret = signService.saveSign(lessonKey.getKeyid(),lessonid,userid,name,xuehao);
        if(ret==0){
            ret =1;
        }
    }
    return ret;
    }

    //签到列表
    @RequestMapping(value = "/getSignList",method = RequestMethod.POST)
    // keyid 需要时最新的
    public List<SignList> getSignList(@RequestParam int lessonid ){

        //找到最新的keyid 即找到最新的签到码
       int keyid = lessonKeyService.getLessonKey(lessonid).getKeyid();

     return signService.getSignList( lessonid,keyid);
    }
}
