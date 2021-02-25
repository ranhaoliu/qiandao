package com.house.wym.entity;

import java.util.Date;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/5 21:14
 */
public class QueQin {
    private int keyid;
    private int lessonid;
    private String openid;
    private int xuehao;
    private String name;
    private Date qtime;

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

    public int getXuehao() {
        return xuehao;
    }

    public void setXuehao(int xuehao) {
        this.xuehao = xuehao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getQtime() {
        return qtime;
    }

    public void setQtime(Date qtime) {
        this.qtime = qtime;
    }

    @Override
    public String toString() {
        return "QueQin{" +
                "keyid=" + keyid +
                ", lessonid=" + lessonid +
                ", openid='" + openid + '\'' +
                ", xuehao=" + xuehao +
                ", name='" + name + '\'' +
                ", qtime=" + qtime +
                '}';
    }
}
