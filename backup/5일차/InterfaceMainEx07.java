interface InterAB {
    void method1();

    static void staticMethod() {
        System.out.println("static method 호출");
    }
}

public class InterfaceMainEx07 {
    public static void main(String[] args) {
        InterAB.staticMethod();
    }
}
