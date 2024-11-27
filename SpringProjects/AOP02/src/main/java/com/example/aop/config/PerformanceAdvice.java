package com.example.aop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
public class PerformanceAdvice {

    @Pointcut( "execution( public * say*(..))")
    public void myTarget() {
    }

    @Around( "myTarget()" )
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();
        String methodName = signature.getName();

        //long startTime = System.currentTimeMillis();
        long startTime = System.nanoTime();

        Object obj = null;
        obj = joinPoint.proceed();

        //long endTime = System.currentTimeMillis();
        long endTime = System.nanoTime();

        System.out.println( methodName + "의 측정시간 : " + ( endTime - startTime) );
        return obj;
    }
}
