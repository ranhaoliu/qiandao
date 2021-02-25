package com.house.wym.controller;

import com.house.wym.entity.QueQin;
import com.house.wym.service.LessonKeyService;
import com.house.wym.service.QueQinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/13 11:12
 */
@RestController
public class QueQinController {
    @Autowired
    LessonKeyService lessonKeyService;
    @Autowired
    QueQinService queQinService;
    //保存缺勤列表
    @RequestMapping(value = "/savequeqin",method = RequestMethod.POST)
    public int saveQueQin( int lessonid, String openid, int xuehao, String name){
//        lessonKeyService.getLessonKey()
        int keyid =lessonKeyService.getLessonKey(lessonid).getKeyid();
       return queQinService.saveQueQin(keyid,lessonid,openid,xuehao,name);
    }

    //显示缺勤列表
    @RequestMapping(value = "/showqueqin",method = RequestMethod.POST)
    public List<QueQin> showQueQin(int keyid){
        return queQinService.showQueQin(keyid);
    }

}
