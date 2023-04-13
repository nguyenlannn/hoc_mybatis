
package com.example.hocmybatis.rest;

import com.example.hocmybatis.rest.page.SelectListStudentPrt;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImpl {

    @Autowired
    private SqlSession sqlSession;

    public Student getStudentById(Long id) {
        Student student = sqlSession.selectOne("NguyenThiLan.getStudentById", id);
        return student;
    }

    public List<Student> getListStudentAll() {
        List<Student> student = sqlSession.selectList("NguyenThiLan.getListStudentAll");
        return student;
    }

    public int editStudentById(EditStudentDto editStudentDto) {
        int student1 = sqlSession.update("NguyenThiLan.editStudentById", editStudentDto);
        return student1;
    }

    public int deleteStudentById(Long id) {
        int laaa = sqlSession.delete("NguyenThiLan.deleteStudentById", id);
        return laaa;
    }

//    public Long getTotalRecord() {
//        return sqlSession.selectOne("NguyenThiLan.getTotalRecord");
//    }
//
//    public List<Student> getPageStudent(SelectListStudentPrt lan) {
//        return sqlSession.selectList("NguyenThiLan.getPageStudent", lan);
//    }

    public Long getTotalRecord() {
        return sqlSession.selectOne("NguyenThiLan.getTotalRecord");
    }

    public List<Student> getPageStudent(SelectListStudentPrt lan) {
        return sqlSession.selectList("NguyenThiLan.getPageStudent", lan);
    }

    public int craeteStudent(CreateStudentReq createStudentReq){
        return sqlSession.insert("NguyenThiLan.createStudent", createStudentReq);
    }
}
