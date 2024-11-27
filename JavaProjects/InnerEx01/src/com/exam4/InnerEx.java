package com.exam4;

public class InnerEx {
    public static void main(String[] args) {
        //익명 이너 클래스
        //참조 변수 사용

        //상속 or 구현 없이 바로 추상메서드를 정의

        //인스턴스화 하면서 메서드 오버라이드
        new InterA() { //객체변수가 없음
            @Override
            public void viewInner() {
                System.out.println("viewInner 호출");
            }
        }.viewInner();
    }
}
