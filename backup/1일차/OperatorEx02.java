public class OperatorEx02 {
    public static void main(String[] args) {
        int i1 = 1_000_000;
        int i2 = 2_000_000;

        //Overflow
        int product1 = i1*i2;
        long product2 = (long)i1*i2;
        System.out.println(product1);
        System.out.println(product2);
    }
}
