package org.example.boot;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

//ApplicationStartingEvent - 프로그램이 시작되면 동작을 실행
public class CustomListener1 implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        System.out.println("Application 시작");
    }
}
