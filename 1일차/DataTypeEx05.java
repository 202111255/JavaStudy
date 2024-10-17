public class DataTypeEx05 {
    public static void main(String[] args) {
        //정수
        //메모리 최적화는 신경쓰지 X
        //byte, short, int(*), long
        int i = 10;
        System.out.println(i);

        byte b = 10;
        short s = 10;
        System.out.println(b);
        System.out.println(s);

        //진법
        int i2 = 0b1010;
        int i8 = 030;
        int i16 = 0xA4;
        System.out.println(i2);
        System.out.println(i8);
        System.out.println(i16);

        //큰수 표기법 : 3자리마다 언더바 두기
        int i3 = 1_000_000_000;
        System.out.println(i3);
    }
}
