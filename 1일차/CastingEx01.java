public class CastingEx01 {
    public static void main(String[] args) {
        short s1 = 10;
        int i1 = s1;
        //자동 형변환
        //작은 자료형 -> 큰 자료형
        System.out.println(s1);
        System.out.println(i1);

        float f1 = 10.0f;
        double d1 = f1;
        System.out.println(d1);
    }
}
