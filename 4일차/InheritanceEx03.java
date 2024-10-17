class Parent3 {
    // Parent3() {
    //     System.out.println("Parent : " + this);
    // }


    Parent3(String name) {
        System.out.println("Parent(String name) : " + this);
    }
}

class Child3 extends Parent3 {
    Child3() {
        super("홍길동");
        System.out.println("Child : " + this);
    }

}

public class InheritanceEx03 {
    public static void main(String[] args) {
        Child3 c = new Child3();
        System.out.println("c : " + c);    
    }
}
