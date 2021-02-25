package com.house.wym.entity;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 10:22
 */
public class Student {
    private String openid;
    private String name;
    private int xuehao;
    private int chanage;

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

    public int getXuehao() {
        return xuehao;
    }

    public void setXuehao(int xuehao) {
        this.xuehao = xuehao;
    }

    public int getChanage() {
        return chanage;
    }

    public void setChanage(int chanage) {
        this.chanage = chanage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "openid='" + openid + '\'' +
                ", name='" + name + '\'' +
                ", xuehao=" + xuehao +
                ", ischanage=" + chanage +
                '}';
    }
}
