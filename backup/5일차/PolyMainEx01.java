class Parent {
    Parent() {
        System.out.println("Parent 생성자 호출");
    }
}

class Child1 {
    Child1() {
        System.out.println("Child1 생성자 호출");
    }
}

class Child2 extends Parent{
    Child2() {
        System.out.println("Child2 생성자 호출");
    }
}


public class PolyMainEx01 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Child1 c1 = new Child1();

        //형변환
        //관계가 없는 클래스는 형변환 불가
        //p = c1;

        Child2 c2 = new Child2();

        //자동형변환(업캐스팅)
        //파생자료형 => 공통 자료형
        //p = c2; 
        
        Parent p2 = new Child2();
        Parent p3 = c2;

        //강제 형변환(다운캐스팅)
        //Child2 c3 = (Child2)p; //에러발생
        Child2 c3 = (Child2)p2;

    }
}