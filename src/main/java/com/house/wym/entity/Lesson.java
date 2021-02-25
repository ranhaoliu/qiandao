package com.house.wym.entity;

import java.util.Date;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 16:35
 */
public class Lesson {
    private  int lessonid;
    private String openid;
    private String slesson;
    private String sclass;
    private Date setTime;

    public int getLessonid() {
        return lessonid;
    }

    public void setLessonid(int lessonid) {
        this.lessonid = lessonid;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getSlesson() {
        return slesson;
    }

    public void setSlesson(String slesson) {
        this.slesson = slesson;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public Date getSetTime() {
        return setTime;
    }

    public void setSetTime(Date setTime) {
        this.setTime = setTime;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonid=" + lessonid +
                ", openid='" + openid + '\'' +
                ", slesson='" + slesson + '\'' +
                ", sclass='" + sclass + '\'' +
                ", setTime=" + setTime +
                '}';
    }
}
