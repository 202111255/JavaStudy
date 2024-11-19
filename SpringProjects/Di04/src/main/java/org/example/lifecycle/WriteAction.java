package org.example.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//빈의 생성, 소멸과정
//InitializingBean, DisposableBean,
// 중간 설정과정
// ApplicationContextAware, BeanNameAware, BeanClassLoaderAware, BeanFactoryAware

public class WriteAction implements Action, InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware, BeanClassLoaderAware, BeanFactoryAware {
    private String writer;

    public WriteAction() {
        System.out.println("1. 생성자 호출");
    }

    public void setWriter(String writer) {
        System.out.println("2. setWriter(String writer) 호출");
        this.writer = writer;
    }

    @Override
    public void execute() {
        System.out.println("*.execute() 호출");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("4. setBeanClassLoader 호출");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("5. setBeanFactory 호출");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("3. setBeanName 호출");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("11. destroy 호출");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("8. afterPropertiesSet 호출");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("6. setApplicationContext 호출");
    }

    public void init_method() {
        System.out.println("9. init_method 호출");
        System.out.println("Bean의 커스텀 초기화의 추가");
    }

    public void destroy_method() {
        System.out.println("12. destroy_method 호출");
        System.out.println("Bean의 커스텀 소멸의 추가");
    }
}
