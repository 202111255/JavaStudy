class Parent1 {
    Parent1() {
        System.out.println("Parent1 생성자 호출");
    }
}

abstract class Parent2 {
    Parent2() {
        System.out.println("Parent2 생성자 호출");
    }

    //일반 메서드 / 추상메서드
    void viewData1() {
        System.out.println("Parent2 viewData1() 호출");
    }

    abstract void viewData2(); //아래서 구현해주어야 함
}

class Child3 extends Parent2 {
    Child3() {
        System.out.println("Child2 생성자 호출");
    }

    @Override
    void viewData2() {
        System.out.println("Child2 viewData2() 호출");
    }

}

public class AbstractMainEx01 {
    public static void main(String[] args) {
        Parent p1 = new Parent();

        //추상 클래스는 직접적인 인스턴스화가 안됨
        //상속에 의해서 처리
        //Parent p2 = new Parent();
        Child3 c2 = new Child3();
        c2.viewData1();
        c2.viewData2();
    }
}
