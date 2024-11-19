package org.example.aop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class BasicAdvice {
    @Around("myTarget()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        return null;
    }
}
