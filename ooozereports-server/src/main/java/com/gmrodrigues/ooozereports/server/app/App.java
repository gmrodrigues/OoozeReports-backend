package com.gmrodrigues.ooozereports.server.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.gmrodrigues.ooozereports.server")
@EnableAutoConfiguration
public class App
{
    private App(){}
    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }
}
