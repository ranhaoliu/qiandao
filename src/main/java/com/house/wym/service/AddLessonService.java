package com.house.wym.service;

import com.house.wym.entity.AddLesson;

import java.util.Date;
import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 19:34
 */
public interface AddLessonService {
    public List<AddLesson> getMyLesson(String userid);
    //如果选过了返回true ，没选返回false
    public boolean checkMyLesson(String userid,int lessonid);

    public int addMyLesson(String userid, int lessonid, String slesson, String sclass );
    // 删除我的选课中的某一门课
    public int delete_mylesson(String userid,int lessonid);
}
