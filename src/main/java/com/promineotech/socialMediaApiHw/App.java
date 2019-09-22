package com.promineotech.socialMediaApiHw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.promineotech.socialMediaApiHw")
@SpringBootApplication


public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}