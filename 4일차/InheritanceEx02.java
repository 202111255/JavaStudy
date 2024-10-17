class Parent {
    void viewParent() {
        System.out.println("Parent viewParent() 호출");
    }
}

class Child extends Parent{
    void viewChild() {
        System.out.println("Child viewChild() 호출");
    }

    //Overriding (재정의)
    void viewParent() {
        System.out.println("응 재정의 할거야");
    }
}


public class InheritanceEx02 {
    public static void main(String[] args) {
        Child c = new Child();
        c.viewChild();
        c.viewParent();
    }
}
