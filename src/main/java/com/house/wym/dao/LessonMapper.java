package com.house.wym.dao;

import com.house.wym.entity.Lesson;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 16:38
 */
@Mapper
public interface LessonMapper {
    //学生添加选课
    public int addLesson(String userid, String slesson, String sclass);
    //得到所有课程
    public List<Lesson> getAllLessonByTime();

    //根据老师的openid 得到他教的所有课程
    public List<Lesson>  getAllLessonsByUserId(String userid);


}
