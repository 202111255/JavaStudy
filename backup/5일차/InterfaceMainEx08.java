interface Inter8 {
    void method1();

    default void method2() {
        System.out.println("method2 호출");
    }

    private void method3() {
        System.out.println("method3 호출");
    }
}

class Class8 implements Inter8 {
    public void method1() {
        System.out.println("method1 호출");
    }
}
 
public class InterfaceMainEx08 {
    public static void main(String[] args) {
        Class8 a = new Class8();
        a.method1();
        a.method2();
        
        //a.method3();

    }
}
