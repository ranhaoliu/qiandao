package com.house.wym.controller;

import com.house.wym.entity.Lesson;
import com.house.wym.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 17:10
 *
 * 测试增加老师和课程.
 */
@RestController
public class lessonController {
    @Autowired
    LessonService lessonService;
//    //老师添加或者说创建课程 test
//    @RequestMapping(value = "/addLesson",method = RequestMethod.POST)
//    public int addLesson(HttpServletRequest request){
//        String userid =request.getParameter("userid");
//        String slesson = request.getParameter("slesson");
//        String sclass = request.getParameter("sclass");
//        lessonService.addLesson(userid,slesson,sclass);
//        return 0;
//    }

    //加载所有课程
    @RequestMapping("/load_student_lesson")
    public ArrayList<Lesson> load_student_lesson(){
        return (ArrayList<Lesson>) lessonService.getAllLessonByTime();

    }
    //根据userid查询老师所教的所有课程
    @RequestMapping(value = "/get_teacher_by_userid",method = RequestMethod.POST)
    public List<Lesson> getAllLessonsByUserId(@RequestParam String userid){
        return (ArrayList<Lesson>) lessonService.getAllLessonsByUserId(userid);
    }


}
