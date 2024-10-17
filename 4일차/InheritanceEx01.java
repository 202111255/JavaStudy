class Parent1 {
    String p = "parent";
    void viewParent() {
        System.out.println("viewParent() 호출");
    }
}

class Child1 {
    void viewChild() {
        System.out.println("Child 1 viewChild() 호출");
    }
}

class Child2 extends Parent1 {
    String c2 = "child2";
    void viewChild() {
        System.out.println("Child 2 viewChild() 호출");
    }
}

class GrandChild2 extends Child2 {
    String gc2 = "grandchild2";
    void viewGrandChild() {
        System.out.println("GrandChild1 viewGrandChild() 호출");
    }
}

//실행 클래스
public class InheritanceEx01 {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.viewParent();

        Child1 c1 = new Child1();
        c1.viewChild();

        Child2 c2 = new Child2();
        c2.viewChild();
        c2.viewParent(); //c2는 부모를 상속받아서 부모의 함수도 사용할 수 있음

        GrandChild2 g2 = new GrandChild2();
        g2.viewGrandChild();
        g2.viewChild();
        g2.viewParent();
        System.out.println(g2.gc2);
        System.out.println(g2.c2);
        System.out.println(g2.p);
    }
}
