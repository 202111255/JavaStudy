class Parent4 {
    String p = "박문수";
    void viewParent() {
        System.out.println("Patent viewParent");
    }
}

class Child4 extends Parent4 {
    String c = "임꺽정";
    String p = "홍길동";
    void viewChild() {
        System.out.println("viewChild");
    }

    void viewParent() {
        System.out.println("Child viewParent");
    }

    void parentView() {
        System.out.println(super.p);
    }

}

public class InheritanceEx04 {
    public static void main(String[] args) {
        Child4 c = new Child4();
        System.out.println(c.c);
        System.out.println(c.p);

        c.viewChild();
        c.viewParent();
        c.parentView();
    }
}
