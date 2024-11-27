interface InterA {
    void methodA();
    default void methodB() {
        System.out.println("method B호출");
    }
}

class ClassAA implements InterA {
    public void methodA() {
        System.out.println("method A호출");
    }
}

public class InterfaceMainEx05 {
    public static void main(String[] args) {
        ClassAA a = new ClassAA();
        a.methodA();
        a.methodB();
    }
}
