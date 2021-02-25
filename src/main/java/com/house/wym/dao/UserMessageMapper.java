package com.house.wym.dao;

import com.house.wym.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: 刘浩然
 * @Date: 2021/2/4 10:26
 */
@Mapper
public interface UserMessageMapper {
    //通过openid 得到学生
    public Student getStudentByUserId(String userid);
    //判断是否是第一次修改
    public int getStudentIsChange(String userid);
    //更改信息
    public int changeMgs(String userid,String newname,int newxuehao);
    public Student check_student(String userid);
    public  int addStudent(String userid , String name, int xuehao);

    // 选出选了某门课的所有学生
    public List<Student> getAllStudentsByLessonId(int lessonid);
}
