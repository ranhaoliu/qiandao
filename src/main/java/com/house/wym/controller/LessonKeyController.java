package com.house.wym.controller;

import com.house.wym.entity.LessonKey;
import com.house.wym.service.LessonKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 22:12
 */
@RestController
public class LessonKeyController {
    @Autowired
    LessonKeyService lessonKeyService;
    // 得到指定 lessonid 的 签到 lessonkey
    @RequestMapping(value = "/getLessonKey",method = RequestMethod.POST)
    public LessonKey getLessonKey(HttpServletRequest request) {
        int lessonid = Integer.parseInt(request.getParameter("id"));
        return lessonKeyService.getLessonKey(lessonid);

    }
    @RequestMapping(value = "/checkKaoqin" ,method = RequestMethod.POST)
    public int checkKaoqinstate(HttpServletRequest request) {
        int lessonid = Integer.parseInt(request.getParameter("id"));
        System.out.println("打印lessonid....."+ lessonid);
       return lessonKeyService.checkKaoqinstate(lessonid);
    }
    //老师发放签到key并且 保存签到key 到数据库中
    @RequestMapping(value = "/savekey",method = RequestMethod.POST)
    public int saveKey(HttpServletRequest request){
        int lessonid = Integer.parseInt(request.getParameter("id"));
            String lessonkey = request.getParameter("signKey");
            System.out.println("lessonid"+lessonid);
            System.out.println("lessonKey"+lessonkey);
            return lessonKeyService.saveKey(lessonid,lessonkey);
    }

    //停止签到, 让 state 设置为0
    @RequestMapping(value = "/stopSign",method = RequestMethod.POST)
    public int stopSign(HttpServletRequest request){
        int lessonid = Integer.parseInt(request.getParameter("id"));// lessonid
        LessonKey key = lessonKeyService.getLessonKey(lessonid);
        if (key == null){
            return -1;
        }else return lessonKeyService.stopSign(lessonid);
    }
}
