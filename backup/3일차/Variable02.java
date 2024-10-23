class Variable {
    String instanceVariable;
    static String classVariable;

    //인스턴스 메서드
    void doFunc1() {
        System.out.println("doFunc1() 호출: " + this.instanceVariable);
    }
    //클래스 메서드
    static void doFunc2() {
        System.out.println("doFunc2() 호출");
    }
}

public class Variable02 {
    public static void main(String[] args) {
        Variable v1 = new Variable();
        Variable v2 = new Variable();

        v1.instanceVariable = "홍길동";
        
        v2.instanceVariable = "박문수";

        v1.doFunc1();
        v2.doFunc1();

        //클래스 메서드는 인스턴스를 생성하지 않아도 호출할 수 있음
        Variable.doFunc2();
        //Variable.doFunc1(); --오류 발생
    }
}
