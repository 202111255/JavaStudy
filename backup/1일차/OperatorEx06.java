public class OperatorEx06 {
    public static void main(String[] args) {
        // 증감연산자 - 단항연산자(항이 1개라서)
        int a = 10;
        a = a + 1;  // 산술연산자
        a += 1;     // 복합대입연산자
        a++;        // 증감연산자 (후위)
        ++a;        // 전위

        a--;        // 감소
        System.out.println( a );


        int a1 = 10;
        int a2 = 10;

        int b1 = ++a1;
        int b2 = a2++;

        System.out.println( "b1 = " + b1 );  // 11 전위 (먼저 증가한 뒤 할당)
        System.out.println( "b2 = " + b2 );  // 10 후위 (먼저 할당한 뒤 증가)
        System.out.println( "a1 = " + a1 );  // 11 둘 다 증가
        System.out.println( "a2 = " + a2 );  // 11 둘 다 증가

    }
}