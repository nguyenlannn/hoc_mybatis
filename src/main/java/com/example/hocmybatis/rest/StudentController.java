package com.example.hocmybatis.rest;

import com.example.hocmybatis.rest.page.StudentPageRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

//@Validated
@RestController
@RequestMapping("/test")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    //lấy thông tin sinh viên theo id
    @GetMapping("/{id}")
    public ResponseEntity<?> getDetailStudent(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.getDetailStudent(id));
    }

    //lấy danh sách sinh viên
    @GetMapping("")
    public ResponseEntity<?> getListStudent() {
        return ResponseEntity.ok(studentService.getListStudent());
    }

    //sửa sinh viên theo id
    @PutMapping("/{id}")
    public ResponseEntity<?> editStudentById(@PathVariable Long id,
                                             @RequestBody EditStudentDto editStudentDto) {
        return ResponseEntity.ok(studentService.editStudentById(id, editStudentDto));
    }

    //xóa sinh viên theo id
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudentById(@PathVariable Long id) {
        return ResponseEntity.ok(studentService.deleteStudentById(id));
    }

    //phân trang
//    @GetMapping("/page")
//    public StudentPageRes pageStudent(@RequestParam(defaultValue = "10") Long pageSize,
//                                      @RequestParam(defaultValue = "1") Long pageNo){
//        return studentService.pageStudent(pageSize,pageNo);
//    }
    @GetMapping("/page")
    public StudentPageRes pageStudent(@RequestParam(defaultValue = "10") Long pageSize,
                                      @RequestParam(defaultValue = "1") Long pageNo,
                                      @RequestParam(required = false) String name,
                                      @RequestParam(required = false) String age) {
        return studentService.pageStudent(pageSize, pageNo, name, age);
    }

    @PostMapping("/insert")
    public ResponseEntity<?> createStudent(@RequestBody @Valid CreateStudentReq createStudentReq) {
        return ResponseEntity.ok(studentService.createStudent(createStudentReq));
    }
}
