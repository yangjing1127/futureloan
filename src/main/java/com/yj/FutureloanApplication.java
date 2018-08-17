package com.yj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yj.dao")
public class FutureloanApplication {

    public static void main(String[] args) {

        SpringApplication.run(FutureloanApplication.class, args);

       // http://localhost:7878/member/showMember?id=30805
    }
}
