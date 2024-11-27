interface InterA {
    public static final String STR1 = "홍길동";
    String STR2 = "박문수"; //public static final 자동 추가

    public abstract void methodA();
    void methodB(); //public abstract 자동 추가
}

abstract class ClassA implements InterA {
    public void methodA() {
        System.out.println("methodA 호출");
    }

    // public void methodB() {
    //     System.out.println("methodB 호출");
    // } --> 이거를 구현하지 않으면 추상클래스가 된다

}

class ClassAA extends ClassA {
    public void methodB() {
        System.out.println("methodB 호출");
    } 
}

public class InterfaceMainEx01 {
    public static void main(String[] args) {
        ClassAA aa = new ClassAA();
        aa.methodA();
        aa.methodB();
    }
}
