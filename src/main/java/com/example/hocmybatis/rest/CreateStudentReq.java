package com.example.hocmybatis.rest;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
public class CreateStudentReq {

    @NotNull
    @Length(max = 10, min = 4)
    private Long id;
    @NotNull
    private String avatar;

    @NotBlank(message = "Name cannot be null")
    @Length(max = 50)
    private String name;

    @Positive
    private String age;

    private String classRoom;
}
