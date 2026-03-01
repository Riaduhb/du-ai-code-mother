package com.du.duaicodemother;

import jdk.jfr.MemoryAddress;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.du.duaicodemother.mapper")
public class DuAiCodeMotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuAiCodeMotherApplication.class, args);
    }

}
