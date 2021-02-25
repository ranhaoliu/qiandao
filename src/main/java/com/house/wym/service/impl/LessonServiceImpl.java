package com.house.wym.service.impl;

import com.house.wym.dao.LessonMapper;
import com.house.wym.entity.Lesson;
import com.house.wym.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 17:08
 */
@Service
public class LessonServiceImpl implements LessonService {
    @Autowired
    LessonMapper lessonMapper;
    @Override
    public int addLesson(String userid, String slesson, String sclass) {
      return lessonMapper.addLesson(userid,slesson,sclass);

    }

    @Override
    public List<Lesson> getAllLessonByTime() {
//        ArrayList <Lesson> lessonArrayList =new ArrayList<>();
        return lessonMapper.getAllLessonByTime();

    }

    @Override
    public List<Lesson> getAllLessonsByUserId(String userid) {

       return lessonMapper.getAllLessonsByUserId(userid);
    }
}
