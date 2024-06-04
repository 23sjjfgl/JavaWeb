package com.lanqiao.service.impl;

import com.lanqiao.mapper.PointMapper;
import com.lanqiao.pojo.Classroom;
import com.lanqiao.pojo.Student;
import com.lanqiao.service.PointService;
import com.lanqiao.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class PointServiceImpl implements PointService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    // 1.查询班级列表
    public List<Classroom> selectClassRomm() {
        // 2.获取sqlsession对象
        SqlSession sqlSession = factory.openSession();
        // 3.获取BrandMapper
        PointMapper mapper = sqlSession.getMapper(PointMapper.class);
        List<Classroom> selectClassRomm = mapper.selectClassRomm();
        sqlSession.close();
        return selectClassRomm;
    }

    // 2.添加班级
    public void AddClassRomm(Classroom classroom) {
        // 2.获取sqlsession对象
        SqlSession sqlSession = factory.openSession();
        // 3.获取BrandMapper
        PointMapper mapper = sqlSession.getMapper(PointMapper.class);
        mapper.AddClassRomm(classroom);

        sqlSession.commit();
        sqlSession.close();
    }

    // 3.修改
    public void update(Classroom classroom) {
        // 2.获取sqlsession对象
        SqlSession sqlSession = factory.openSession();
        // 3.获取BrandMapper
        PointMapper mapper = sqlSession.getMapper(PointMapper.class);
        mapper.update(classroom);

        sqlSession.commit();
        sqlSession.close();
    }


    // 4.删除班级


    // 学生管理
    // 1.查出学生列表
    public Classroom cs(Integer id) {
        // 2.获取sqlsession对象
        SqlSession sqlSession = factory.openSession();
        // 3.获取BrandMapper
        PointMapper mapper = sqlSession.getMapper(PointMapper.class);
        Classroom cs = mapper.cs(id);
        sqlSession.close();
        return cs;
    }

    // 2.添加学生
    public void AddStudent(Student student) {
        // 2.获取sqlsession对象
        SqlSession sqlSession = factory.openSession();
        // 3.获取BrandMapper
        PointMapper mapper = sqlSession.getMapper(PointMapper.class);
        mapper.AddStudent(student);
        sqlSession.commit();
        sqlSession.close();
    }

    // 3.修改学生
    public void updateStudent(Student student) {
        // 2.获取sqlsession对象
        SqlSession sqlSession = factory.openSession();
        // 3.获取BrandMapper
        PointMapper mapper = sqlSession.getMapper(PointMapper.class);
        mapper.updateStudent(student);
        sqlSession.commit();
        sqlSession.close();
    }
}
