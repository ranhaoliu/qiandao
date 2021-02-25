package com.house.wym.entity;

import java.util.Date;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 22:42
 */
public class SignList {
    private int id;
    //lessonkey 表中的主键
    private  int keyid;
    //课程id
    private int lessonid;
    private String openid;
    // 签到学生姓名
    private String name;
    //学号
    private String xuehao;
    //签到时间
    private Date signTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getXuehao() {
        return xuehao;
    }

    public void setXuehao(String xuehao) {
        this.xuehao = xuehao;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    @Override
    public String toString() {
        return "SignList{" +
                "id=" + id +
                ", keyid=" + keyid +
                ", lessonid=" + lessonid +
                ", openid='" + openid + '\'' +
                ", name='" + name + '\'' +
                ", xuehao='" + xuehao + '\'' +
                ", signTime=" + signTime +
                '}';
    }
}
