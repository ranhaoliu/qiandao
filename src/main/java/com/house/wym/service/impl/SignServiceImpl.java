package com.house.wym.service.impl;

import com.house.wym.dao.SignMapper;
import com.house.wym.entity.SignList;
import com.house.wym.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 22:59
 */
@Service
public class SignServiceImpl implements SignService {
    @Autowired
    SignMapper signMapper;
    //保存签到记录
    @Override
    public int saveSign(int keyid,int lessonid,String openid,String name,String xuehao) {
        signMapper.saveSign( keyid, lessonid, openid, name, xuehao);
        return 0;
    }

    @Override
    public List<SignList> getSignList(int lessonid,int keyid) {
        return signMapper.getSignList(lessonid ,keyid);

    }
}
