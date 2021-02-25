package com.house.wym.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.house.wym.entity.Student;
import com.house.wym.service.LessonService;
import com.house.wym.service.UserMessgeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 10:08
 */
@RestController
public class userMessageController {
    @Autowired
    UserMessgeService userMessageService;
    @Autowired
    LessonService lessonService;

    @RequestMapping(value = "/usermessage", method = RequestMethod.POST)
    public String userMessage( @RequestBody String userid){
//       Student student = userMessageService.getStudentByUserId(userid.split("=")[1]);
        System.out.println("userid"+userid.split("=")[1]);
       Student student = userMessageService.getStudentByUserId(userid.split("=")[1]);
        Object o =JSONObject.toJSON(student);
        return o.toString();
    }

    @RequestMapping(value = "/changeMgs",method = RequestMethod.POST)
    public int changeMgs (HttpServletRequest request){
        String userid = request.getParameter("userid");
        String newname = request.getParameter("newname");
         int newxuehao = Integer.parseInt(request.getParameter("newxuehao"));
//        System.out.println("newxuehao"+newxuehao);
        int isCanchange  = userMessageService.getStudentIsChange(userid);
        int re;
        if (isCanchange == 0){
             re = userMessageService.changeMgs(userid,newname,newxuehao);
        }else {
            return 0;
        }

        return re;
    }
    //检查是否注册
    @RequestMapping(value = "/check_student")
    public boolean check_student(@RequestParam("userid") String userid){
        boolean is_register = userMessageService.check_student(userid);
//        System.out.println("check.."+is_register);
        return is_register;
    }

    //  添加学生注册或老师进行添加课程
    @RequestMapping(value = "/sign",method = RequestMethod.POST)
    public String test_addStudent(HttpServletRequest request){
        String userid = request.getParameter("userid");
        String name =request.getParameter("sname");
        String xuehao =  request.getParameter("snum") ;
        String slesson = request.getParameter("slesson");
        String sclass = request.getParameter("sclass");
        int re=0;
        if(name!="" && xuehao !=""){
             int xuehao_= Integer.parseInt(xuehao);
              re = userMessageService.addStudent(userid,name,xuehao_);
              System.out.println("打印res 。。。。。");

        }else if( slesson!=""&& sclass!=""){
             re = lessonService.addLesson(userid,slesson,sclass);
        }
        if(re == 1){
            return "student_success";
        }else {
            return "fail";
        }
    }


    // 选出选了某门课的所有学生
    @RequestMapping(value = "/getAllStudentsByLessonId",method = RequestMethod.POST)
    public List<Student> getAllStudentsByLessonId(@RequestParam int lessonid){
      return   userMessageService.getAllStudentsByLessonId(lessonid);

    }

}
