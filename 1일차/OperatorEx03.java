public class OperatorEx03 {
    public static void main(String[] args) {
        
        int i1 = 10;
        int i2 = 20;
        int sum1 = i1 + i2;
        System.out.println( sum1 );

        short s1 = 10;
        short s2 = 20;
        
        // 산술 연산을 위한 기본자료형 => int 이상
        // short sum2 = s1 + s2;   // 에러발생
        // int sum2 = s1 + s2;   // 정상작동
        
        short sum2 = (short)(s1 + s2);   // 강제형변환

        System.out.println( sum2 );
    }
}