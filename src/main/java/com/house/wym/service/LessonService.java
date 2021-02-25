package com.house.wym.service;

import com.house.wym.entity.Lesson;

import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 17:08
 */
public interface LessonService {
    // 学生添加选课
    public int addLesson(String userid, String slesson, String sclass);
    //查询所有课程
    public List<Lesson> getAllLessonByTime();

    // 老师根据openid 得到他所教的所以课程
    public List<Lesson>  getAllLessonsByUserId(String userid);
}
