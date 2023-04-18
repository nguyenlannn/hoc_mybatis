package com.example.hocmybatis.rest;

import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentReq {

    @NotNull
    @Max(10)
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
