package com.example.hocmybatis.rest.page;

import com.example.hocmybatis.rest.Student;
import lombok.Data;

import java.util.List;

@Data
public class StudentPageRes {
    //số bản ghi trong 1 trang
    private Long pageSize;

    // trang hiện tại
    private Long pageNo;

    //tổng số trang
    private Long totalPage;

    //tổng số bản ghi
    private Long totalRecord;

    //danh sách bản ghi
    private List<Student> record;
}
