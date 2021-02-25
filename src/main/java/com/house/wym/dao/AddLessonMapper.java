package com.house.wym.dao;

import com.house.wym.entity.AddLesson;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 19:32
 */
@Mapper
public interface AddLessonMapper {
    //得到我的选课
    public List<AddLesson> getMyLesson(String userid);
    //检查我是否选了某一门课
    public List<AddLesson> checkMyLesson(String userid,int lessonid);
    //选课
    public int addMyLesson(String userid, int lessonid, String slesson, String sclass );

    //从我的选课中删除
    public int delete_mylesson(String userid,int lessonid);
}
