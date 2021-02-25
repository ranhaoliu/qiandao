package com.house.wym.service.impl;

import com.house.wym.dao.AddLessonMapper;
import com.house.wym.dao.LessonMapper;
import com.house.wym.entity.AddLesson;
import com.house.wym.service.AddLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 19:34
 */
@Service
public class AddLessonServiceImpl implements AddLessonService {
    @Autowired
    AddLessonMapper addLessonMapper;
    @Override
    public List<AddLesson> getMyLesson(String userid) {
//        System.out.println("执行前");
       return addLessonMapper.getMyLesson(userid);

    }
    //检查某一门课程是否选过
    @Override
    public boolean checkMyLesson(String userid, int lessonid) {
       ArrayList<AddLesson> addLessons= (ArrayList<AddLesson>) addLessonMapper.checkMyLesson(userid,lessonid);
      if (addLessons.size() == 0){
          return false;
      }else {
          return true;
      }
    }

    @Override
    public int addMyLesson(String userid, int lessonid, String slesson, String sclass ) {
        int ret = addLessonMapper.addMyLesson(userid,lessonid,slesson,sclass );
        return ret;
    }


    @Override
    public int delete_mylesson(String userid, int lessonid) {
      return addLessonMapper.delete_mylesson(userid,lessonid);


    }
}
