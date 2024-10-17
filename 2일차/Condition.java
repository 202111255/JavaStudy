public class Condition {
    public static void main(String[] args) {
        System.out.println("시작");
        System.out.println("진행");
        System.out.println("끝");

        //data란 변수의 값이 10이면 10이다라는 문장을 출력하고 아니면 출력하지 말 것
        //비교연산자 사용
        int data = 10;
        if (data == 10) {
            System.out.println("10이다");
        }

        //문제) 나이(age)가 18세 이상이면 "선거 가능"이라고 출력
        int age = 29;
        if (age >= 18) {
            System.out.println("선거 가능");
        }

        //문제) 나이(age)가 18세 이상이면 "선거 가능"이라고 출력하고 18 미만 "선거 불가능" 이라고 출력
        if (age >= 18) {
            System.out.println("선거 가능");
        } else {
            System.out.println("선거 불가능");
        }

        //변수의 값이 짝수면 "짝수 출력"하고 홀수면 "홀수 출력"
        int num = 5;
        if (num % 2 == 0) {
            System.out.println("짝수 출력");
        } else {
            System.out.println("홀수 출력");
        }

        //변수값이 5와 10 사이에 있으면 "영역내" 출력하고 그렇지 않으면 "영역외 출력"
        int num2 = 7;
        if (num2 >= 5 && num2 <= 10) {
            System.out.println("영역내");
        } else {
            System.out.println("영역외");
        }

        int score = 74;
        switch (score/10) {
            case 6: System.out.println("D"); break;
            case 7: System.out.println("C"); break;
            case 8: System.out.println("B"); break;
            case 9: System.out.println("A"); break;
            case 10: System.out.println("A"); break;
            default: System.out.println("F");
        }

        //3항 연산자
        //char c1 = (10 > 3) ? 'a' : 'b';
       // System.out.println(c1);
    }
    
}
