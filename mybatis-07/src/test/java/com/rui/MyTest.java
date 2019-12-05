package com.rui;

import com.rui.dao.StudentMapper;
import com.rui.dao.TeacherMapper;
import com.rui.pojo.Student;
import com.rui.pojo.Teacher;
import com.rui.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;


public class MyTest {
    @Test
    public void test(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Teacher teacher = sqlSession.getMapper(TeacherMapper.class).getTeacher(1);
        System.out.println(teacher);
        /*
        * Teacher
        * (id=1, name=秦老师,
        * students=[Student(id=1, name=小明, tid=1),
        * Student(id=2, name=小红, tid=1), Student(id=3, name=小张, tid=1),
        * Student(id=4, name=小李, tid=1), Student(id=5, name=小王, tid=1)])
         * */
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        Teacher teacher = sqlSession.getMapper(TeacherMapper.class).getTeacher2(1);
        System.out.println(teacher);

        sqlSession.close();
    }
}
