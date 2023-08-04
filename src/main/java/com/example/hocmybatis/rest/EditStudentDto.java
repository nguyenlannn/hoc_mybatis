package com.example.hocmybatis.rest;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EditStudentDto implements Serializable {
    private Long id;
    private String avatar;
    private String name;
    private String age;
    private String classRoom;
}
