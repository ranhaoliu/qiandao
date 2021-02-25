package com.house.wym.controller;

import com.house.wym.entity.AddLesson;
import com.house.wym.service.AddLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 19:12
 * 选课控制器
 */
@RestController
public class addlessonController {
    @Autowired
    AddLessonService addLessonService;
    //得到我的选课
    @RequestMapping(value = "/getmylesson",method = RequestMethod.POST)
    public List<AddLesson> getMyLesson(HttpServletRequest request){
        String userid =request.getParameter("userid");
        System.out.println();
           return addLessonService.getMyLesson(userid);
    }
    /** // 测试是否选过了某一门课
    @RequestMapping("/checkMyLesson")
    public boolean checkMyLesson(HttpServletRequest request){
        String userid =request.getParameter("userid");
        int lessonid = Integer.parseInt(request.getParameter("lessonid"));
        boolean ischeck = addLessonService.checkMyLesson(userid,lessonid);
        System.out.println("ischeck "+ischeck);
        return ischeck;
    }
    **/

    //测试增加我的课程
    @RequestMapping("/addmylesson")
    public int addMyLesson(HttpServletRequest request){
        String userid =request.getParameter("userid");
        int lessonid = Integer.parseInt(request.getParameter("lessonid"));
        String slesson =request.getParameter("slesson");
        String sclass =request.getParameter("sclass");
        boolean ischecked  =addLessonService.checkMyLesson(userid,lessonid);
        if (!ischecked){
            return addLessonService.addMyLesson(userid,lessonid,slesson,sclass);
        }else {
            return -1;
        }
    }
    //删除我的选课
    @RequestMapping("/delete_mylesson")
    public int delete_mylesson(HttpServletRequest request){
        String userid =request.getParameter("userid");
        int lessonid = Integer.parseInt(request.getParameter("lessonid"));
        return addLessonService.delete_mylesson(userid,lessonid);
    }
}
