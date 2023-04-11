package com.example.hocmybatis.rest.page;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SelectListStudentPrt {
    private Long limit;
    private Long offset;

    private String name;

    private String age;

}
