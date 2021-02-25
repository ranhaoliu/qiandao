package com.house.wym.dao;

import com.house.wym.entity.QueQin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/13 10:57
 */
@Mapper
public interface QueQinMapper {

    //保存缺勤列表
    public int saveQueQin(int keyid,int lessonid, String openid, int xuehao, String name);
    //显示缺勤列表
    public List<QueQin>showQueQin(int keyid);
}
