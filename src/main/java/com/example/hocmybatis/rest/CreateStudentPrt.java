package com.example.hocmybatis.rest;

import lombok.Data;

@Data
public class CreateStudentPrt {

    private Long id;
    private String avatar;

    private String name;

    private String age;

    private String classRoom;
}
