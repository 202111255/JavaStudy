package com.util1;
import java.util.Random;
public class RamdomEx01 {
    public static void main(String[] args) {
        Random rand1 = new Random(System.currentTimeMillis());
        System.out.println(rand1);

        System.out.println(rand1.nextInt(10));
        System.out.println(rand1.nextInt(45) + 1);
        System.out.println(rand1.nextInt(45) + 1);
        System.out.println(rand1.nextInt(45) + 1);
        System.out.println(rand1.nextInt(45) + 1);
        System.out.println(rand1.nextInt(45) + 1);
        System.out.println(rand1.nextInt(45) + 1);
    }
}
