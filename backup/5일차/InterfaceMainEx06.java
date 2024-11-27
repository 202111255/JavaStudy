interface InterA1 {
    void method1();

    default void method2() {
        System.out.println("r");
    }
}

class ClassA1 implements InterA1 {
    public void method1() {
        System.out.println("ClassA method1 호출");
    }

    //오버라이드
   public void method2() {
        System.out.println("r");
    }
}

class ClassB1 implements InterA1 {
    public void method1() {
        System.out.println("ClassB method1 호출");
    }
}

class ClassC1 implements InterA1 {
    public void method1() {
        System.out.println("ClassC method1 호출");
    }
}


public class InterfaceMainEx06 {
    public static void main(String[] args) {
        ClassA1 a = new ClassA1();
        ClassB1 b = new ClassB1();
        ClassC1 c = new ClassC1();

        a.method1();
        b.method1();
        c.method1();
        
    }
}
