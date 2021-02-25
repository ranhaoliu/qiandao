package com.house.wym.service.impl;

import com.house.wym.dao.LessonKeyMapper;
import com.house.wym.dao.LessonMapper;
import com.house.wym.entity.LessonKey;
import com.house.wym.service.LessonKeyService;
import com.house.wym.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 22:09
 */
@Service
public class LessonKeyServiceImpl implements LessonKeyService {
   @Autowired
    LessonKeyMapper lessonKeyMapper;
    @Override
    public LessonKey getLessonKey(int lessonid) {
      return lessonKeyMapper.getLessonKey(lessonid);

    }

    @Override
    public int checkKaoqinstate(int lessonid) {
        //
        System.out.println("考勤是否走到实现类");
        return lessonKeyMapper.checkKaoqinstate(lessonid);

    }

    @Override
    public int saveKey(int lessonid, String lessonkey) {
        return lessonKeyMapper.saveKey(lessonid,lessonkey);

    }
    //停止签到
    @Override
    public int stopSign(int lessonid) {
        return lessonKeyMapper.stopSign(lessonid);

    }
}
