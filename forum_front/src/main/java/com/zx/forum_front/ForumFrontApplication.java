package com.zx.forum_front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication
@ServletComponentScan
public class ForumFrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForumFrontApplication.class, args);
    }

}
