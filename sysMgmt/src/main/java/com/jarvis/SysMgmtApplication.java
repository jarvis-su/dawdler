package com.jarvis;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.jarvis.sysmgmt.web.reading.list.ReaderHandlerMethodArgumentResolver;


@SpringBootApplication
@MapperScan("com.jarvis.mapper")
public class SysMgmtApplication extends WebMvcConfigurerAdapter {
    public static void main(String[] args) {
        SpringApplication.run(SysMgmtApplication.class, args);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }

    @Override
    public void addArgumentResolvers(
            List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new ReaderHandlerMethodArgumentResolver());
    }

}
