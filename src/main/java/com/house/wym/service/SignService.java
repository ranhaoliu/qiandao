package com.house.wym.service;

import com.house.wym.entity.SignList;

import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 22:58
 */
public interface SignService {
    //保存签到记录
    public int saveSign(int keyid,int lessonid,String openid,String name,String xuehao);
    //得到签到列表
    public List<SignList> getSignList(int lessonid,int keyid);
}
