class Method {
    void method1() {
        System.out.println("method1() 실행");
    }

    void method2(int a) {
        System.out.println("method2() 실행");
    }
}

public class MethodMain01 {
    public static void main(String[] args) {
        Method m = new Method();
        m.method1(); 

        m.method2(3);
    }
}