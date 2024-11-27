public class Array04 {
    public static void main(String[] args) {
        //문제
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //짝수 인덱스의 합을 구하기
        int sum = 0;
        for (int i = 0; i < arr.length; i+=2) {
            sum += arr[i];
        }
        System.out.println("합: " + sum);
        System.out.printf("합: %d", sum);
    }
}
