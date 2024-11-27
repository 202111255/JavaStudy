package com.example.configurer.config;


import com.example.configurer.interceptor.MyHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    private final MyHandlerInterceptor myHandlerInterceptor;

    public MyWebMvcConfigurer(MyHandlerInterceptor myHandlerInterceptor) {
        System.out.println("MyWebMvcConfigurer 생성자 호출");
        this.myHandlerInterceptor = myHandlerInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myHandlerInterceptor).addPathPatterns("/login");
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/mypage").setViewName("mypage");
    }
}
