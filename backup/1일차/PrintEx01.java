public class PrintEx01 {
    public static void main(String[] args) {
        System.out.print("Hello 1");
        System.out.print("Hello 2");
        System.out.print("Hello 3");

        System.out.println("Hello 1");
        System.out.println("Hello 2");
        System.out.println("Hello 3");

        // %s - 문자열
        // %n - 강제 엔터키
        System.out.printf("%s%n", "Hello 1");
        System.out.printf("%s - %s", "Hello 2", "Hello 3");
    }
}