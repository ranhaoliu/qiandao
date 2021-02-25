package com.house.wym.entity;

import java.util.Date;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 21:54
 */
public class LessonKey {
    private int keyid;
    private int lessonid;
    private String lessonkey;
    private int state;
    private Date time;

    public int getKeyid() {
        return keyid;
    }

    public void setKeyid(int keyid) {
        this.keyid = keyid;
    }

    public int getLessonid() {
        return lessonid;
    }

    public void setLessonid(int lessonid) {
        this.lessonid = lessonid;
    }

    public String getLessonkey() {
        return lessonkey;
    }

    public void setLessonkey(String lessonkey) {
        this.lessonkey = lessonkey;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "LessonKey{" +
                "keyid=" + keyid +
                ", lessonid=" + lessonid +
                ", lessonkey='" + lessonkey + '\'' +
                ", state=" + state +
                ", time=" + time +
                '}';
    }
}
