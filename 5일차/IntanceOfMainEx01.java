abstract class E {

}

interface I {
    void method();
}

class E1 extends E implements I {
    public void method() {};
}

class E2 extends E {

}

public class IntanceOfMainEx01 {
    public static void main(String[] args) {
        E1 e1 = new E1();
        E2 e2 = new E2();

        E e11 = new E1();
        E e12 = new E2();

        //instanceof
        System.out.println(e11 instanceof E1);
        System.out.println(e12 instanceof E2);

        System.out.println(e11 instanceof E2);

        //부모
        System.out.println(e11 instanceof E);
        System.out.println(e12 instanceof E);

        System.out.println(e1 instanceof I);
        System.out.println(e2 instanceof I);
    }
}
