package com.example.hocmybatis.rest;

import com.example.hocmybatis.rest.page.SelectListStudentPrt;
import com.example.hocmybatis.rest.page.StudentPageRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {

    @Autowired
    private StudentRepositoryImpl studentRepository;

    public Student getDetailStudent(Long id) {
        Student studentSer = studentRepository.getStudentById(id);
        return studentSer;
    }

    public List<Student> getListStudent() {
        List<Student> student2 = studentRepository.getListStudentAll();
        return student2;
    }

    public String editStudentById(Long id, EditStudentDto editStudentDto) {
        editStudentDto.setId(id);
        int result = studentRepository.editStudentById(editStudentDto);
        if (result > 0) {
            return "update thanh cong";
        }
        return "that bai";
    }

    public String deleteStudentById(Long id) {
        Student student = new Student();

        student.setId(id);

        int ketqua = studentRepository.deleteStudentById(id);
        if (ketqua > 0) {
            return "xoa ban ghi thanh cong";
        }
        return "xoa ban ghi that bai";
    }

//    public StudentPageRes pageStudent(Long pageSize, Long pageNo) {
//
//
//        Long total = studentRepository.getTotalRecord();
//
//        StudentPageRes studentPageRes = new StudentPageRes();
//        studentPageRes.setPageNo(pageNo);
//        studentPageRes.setPageSize(pageSize);
//        studentPageRes.setTotalRecord(total);
//
//        List<Student> list = studentRepository.getPageStudent(SelectListStudentPrt.builder()
//                .limit(pageSize)
//                .offset(pageSize * (pageNo - 1))
//                .build());
//        studentPageRes.setRecord(list);
//        studentPageRes.setTotalPage((long) Math.ceil(total / pageSize));
//
//        return studentPageRes;
//    }
    public StudentPageRes pageStudent(Long pageSize, Long pageNo, String name, String age) {

        Long total = studentRepository.getTotalRecord();

        StudentPageRes studentPageRes = new StudentPageRes();
        studentPageRes.setPageNo(pageNo);
        studentPageRes.setPageSize(pageSize);
        studentPageRes.setTotalRecord(total);

        List<Student> list = studentRepository.getPageStudent(SelectListStudentPrt.builder()
                .limit(pageSize)
                .offset(pageSize * (pageNo - 1))
                .age(age)
                .name(name)
                .build());
        studentPageRes.setRecord(list);
        studentPageRes.setTotalPage((long) Math.ceil(total / pageSize));

        return studentPageRes;
    }

    public String createStudent(CreateStudentReq req){

         Long bien1= (long) studentRepository.craeteStudent(req);

        CreateStudentPrt chon=new CreateStudentPrt();
        chon.setId(req.getId());
        chon.setAge(req.getAge());
        chon.setName(req.getName());
        chon.setClassRoom(req.getClassRoom());

        if (bien1 > 0) {
            return "them ban ghi thanh cong";
        }
        return "them ban ghi that bai";
    }
}
