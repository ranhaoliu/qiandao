package com.house.wym.service;

import com.house.wym.entity.LessonKey;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 22:09
 */
public interface LessonKeyService {
    public LessonKey getLessonKey(int lessonid);

    //检查考勤状态 state  state== 0 时表示失效
    public int checkKaoqinstate(int lessonid);
    //保存lessonkey
    public int saveKey(int lessonid,String lessonkey);

    //停止签到, 让 state 设置为0
    public int stopSign(int lessonid);
}
