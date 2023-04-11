package com.example.hocmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class HocmybatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(HocmybatisApplication.class, args);
	}

}
