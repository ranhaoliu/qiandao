package com.house.wym.service.impl;

import com.house.wym.dao.UserMessageMapper;
import com.house.wym.entity.Student;
import com.house.wym.service.UserMessgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 10:15
 */
@Service
public class UserMessageServiceimpl implements UserMessgeService {
   @Autowired
   UserMessageMapper userMessageMapper;

    @Override
    public Student getStudentByUserId(String userid) {
        System.out.println("server: "+userid);
      Student student =  userMessageMapper.getStudentByUserId(userid);
//        System.out.println(student.toString());
        return student;
    }

    @Override
    public int getStudentIsChange(String userid) {

        int change = userMessageMapper.getStudentIsChange(userid);
        return change;

    }

    @Override
    public int changeMgs(String userid,String newname,int newxuehao) {
        return userMessageMapper.changeMgs(userid,newname,newxuehao);
    }
    //检查用户是否注册，如果未注册返回false，已注册返回true
    @Override
    public boolean check_student(String userid) {
       Student student = userMessageMapper.check_student(userid);
       if(student == null){
           return false;
       }else
           return true;
    }

    @Override
    public int addStudent(String userid, String name, int xuehao) {

        return userMessageMapper.addStudent(userid,name ,xuehao);

    }
    // 选出选了某门课的所有学生
    @Override
    public List<Student> getAllStudentsByLessonId(int lessonid){
          return   userMessageMapper.getAllStudentsByLessonId(lessonid);
    }
}
