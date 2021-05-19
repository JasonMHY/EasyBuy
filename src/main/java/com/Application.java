package com;

import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        /*ApplicationContextFactory applicationContextFactory=new ApplicationContextFactory() {
            @Override
            public ConfigurableApplicationContext create(WebApplicationType webApplicationType) {
                return null;
            }
        }*/
    }

}
