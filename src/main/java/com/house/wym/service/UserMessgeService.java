package com.house.wym.service;

import com.house.wym.entity.Student;

import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 10:15
 */
public interface UserMessgeService {

    public Student getStudentByUserId(String userid);
    //查看学生是否是第一次修改信息
    public  int getStudentIsChange(String userid);
    public int changeMgs(String userid,String newname,int newxuehao);
    //检查用户是否注册
    public boolean check_student(String userid);
    //注册
    public int addStudent(String userid , String name, int xuehao);
    // 选出选了某门课的所有学生
    public List<Student> getAllStudentsByLessonId(int lessonid);
}
