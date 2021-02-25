package com.house.wym.service;

import com.house.wym.entity.QueQin;

import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/13 10:58
 */
public interface QueQinService {
    //保存缺勤列表
    public int saveQueQin(int keyid,int lessonid, String openid, int xuehao, String name);

    //显示缺勤列表
    public List<QueQin>showQueQin(int keyid);
}
