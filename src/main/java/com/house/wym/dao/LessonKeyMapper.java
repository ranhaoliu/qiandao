package com.house.wym.dao;

import com.house.wym.entity.LessonKey;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 22:01
 */
@Mapper
public interface LessonKeyMapper {
    //通过lessonid 得到 LessonKey
    public LessonKey getLessonKey(int lessonid);
    //检查考勤状态 state  state== 0 时表示失效
    public int checkKaoqinstate(int lessonid);
    public int saveKey(int lessonid,String lessonkey);
    //停止签到, 让 state 设置为0
    public int stopSign(int lessonid);
}
