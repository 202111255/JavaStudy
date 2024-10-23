public class OperatorEx01 {
    public static void main(String[] args) {
        // 이항 연산자 - 산술연산자
        // + - * / %
        // 덧셈, 뺄셈, 곱셈은 평소에 생각하는대로
        // 나눗셈, 나머지는 주의해서 공부해주세요~

        // 나머지 - 정수
        // 일련의 숫자를 그룹화
        // 1 % 2 = 1    => 홀수
        // 2 % 2 = 0    => 짝수
        // 3 % 2 = 1    => 홀수
        // 4 % 2 = 0    => 짝수

        // 짝수와 홀수
        System.out.println( 1 % 2 );
        System.out.println( 2 % 2 );
        System.out.println( 3 % 2 );
        System.out.println( 4 % 2 );

        // 나눗셈
        System.out.println( 2 / 2 );    // 1

        // 자료형
        // 정수 / 정수 = 정수 => 1
        System.out.println( 3 / 2 );    // 1.5(?) 1(!!)
        System.out.println( 5 / 2 );    // 2.5(?) 2(!!)
        
        // 자료형 변환
        // 정수 / 실수 = 실수 => 2.5
        System.out.println( 5 / 2.0 );          // 2.5
        System.out.println( 5 / (double)2 );    // 2.5

        // 결과 변수에 저장
        int i1 = 5;
        int i2 = 2;
        // int result = i1 / i2;
        double result = i1 / (double)i2;
        System.out.println( result );           // 2.5
    }
}