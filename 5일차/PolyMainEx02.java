class Parent {
    Parent() {
        System.out.println("Parent 생성자 호출");
    }
}

class Child1 extends Parent {
    Child1() {
        System.out.println("Child1 생성자 호출");
    }
}

class Child2 extends Parent{
    Child2() {
        System.out.println("Child2 생성자 호출");
    }
}


public class PolyMainEx02 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        //자동형 변환
        Parent p21 = new Child1();
        Parent p22 = new Child2();

        //강제형 변환
        Child1 c11 = (Child1)p21;
        Child2 c21 = (Child2)p22;

        //Child2 c22 = (Child2)p21; --한 자식을 같은 레벨의 다른 자식으로 형변환 불가
        
        
    }
}
