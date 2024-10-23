public class study {
    public static void main(String[] args) {
        //1. 알파벳 찍기
        char c = 65;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
                c+=1;
            }
            System.out.print("\n");
            c = 65;
        }

        //2. 구구단 출력
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d X %d = %d ", i, j, i*j);
            }
            System.out.print("\n");
        }

        //3. 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+...+10)의 결과를 계산하시오.
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println(sum);

    }
}
