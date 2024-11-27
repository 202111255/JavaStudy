package com.exam;

public class LambdaEx05 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        LambdaInter5 f = (arr) -> {
            int sum = 0;
            for (int i : arr) {
                sum += i;
            }
            return sum;
        };
        System.out.println(f.method(arr1));
    }
}
