package com.house.wym.dao;

import com.house.wym.entity.SignList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 22:49
 */
@Mapper
public interface SignMapper {

    //保存签到记录
    public int saveSign(int keyid,int lessonid,String openid,String name,String xuehao);

    //得到签到列表------------------代做----------
    public List<SignList> getSignList(int lessonid ,int keyid);

}
