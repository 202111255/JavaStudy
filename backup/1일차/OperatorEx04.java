public class OperatorEx04 {
    public static void main(String[] args) {
        //기본 자료형 : + => 산술
        //문자열 : + => 문자열 연결 연산자

        //문자열 - 문자열 연결 +
        System.out.println("1" + "1");
        //숫자 - 산술 +
        System.out.println(1+1);
        
        System.out.println("1" + 1 + 1); //111
        System.out.println(1 + "1" + 1); //111
        System.out.println(1 + 1 + "1"); //21
    }
}
