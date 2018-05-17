package com.roger.boot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:config.properties")
public class SpringBootSampleApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootSampleApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
