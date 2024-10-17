//Final 키워드
class Parent01 {
    void viewParent() {
        System.out.println("Parent viewParent");
    }

}

class Child01 extends Parent01 {
    //상수화 된 멤버 필드
    final String name = "홍길동";

    void viewChild() {
        //상수화 된 지역 변수
        final String name = "박문수";
        System.out.println(name);
    }
}


public class FinalMainEx01 {
    public static void main(String[] args) {
        Child01 c = new Child01();
        System.out.println(c.name);

        //c.name = 박문수;

        c.viewChild();
    }
}
