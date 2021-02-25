package com.house.wym.service.impl;

import com.house.wym.dao.QueQinMapper;
import com.house.wym.entity.QueQin;
import com.house.wym.service.QueQinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/13 10:59
 */
@Service
public class QueQinServiceImpl implements QueQinService {
   @Autowired
    QueQinMapper queQinMapper;
    //保存缺勤列表
    @Override
    public int saveQueQin(int keyid,int lessonid, String openid, int xuehao, String name){
      return queQinMapper.saveQueQin(keyid,lessonid,openid,xuehao,name);
    }

    @Override
    public List<QueQin> showQueQin(int keyid) {
        return queQinMapper.showQueQin(keyid);
    }
}
