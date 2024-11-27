package org.example.aop01.model;

import org.springframework.stereotype.Service;

@Service( "target" )
public class TargetService implements Target {

    // 핵심 사항
    @Override
    public String sayEcho(String name) {
        //System.out.println( "전처리" );
        System.out.println( "sayEcho(String name) 호출" );
        //System.out.println( "후처리" );
        return "Hi " + name;
    }
}
