class Modifier1 {
    void method1() {
        System.out.println("default");
    }
    public void method2() {
        System.out.println("public");
    }
    protected void method3() {
        System.out.println("protected");
    }
    private void method4() {
        System.out.println("private");
    }

    Modifier1() {
        method4();
    }
}

public class ModifierMainEx02 {
    public static void main(String[] args) {
        Modifier1 m = new Modifier1();
        m.method1();
        m.method2();
        m.method3();
        //m.method4();
    }
}
