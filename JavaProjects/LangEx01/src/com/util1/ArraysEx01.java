package com.util1;

import java.util.Arrays;

public class ArraysEx01 {
    public static void main(String[] args) {
        String[] arrs = {"aaa", "bbb", "ccc"};
        System.out.println();
        //출력
        System.out.println(Arrays.toString(arrs));

        Arrays.fill(arrs, "xxx");
        System.out.println(Arrays.toString(arrs));

        String[] arr1 = {"aaa", "bbb", "ccc"};
        String[] arr2 = {"aaa", "bbb", "ccc"};

        System.out.println(arr1 == arr2);
        System.out.println(Arrays.equals(arr1, arr2));

        int[] intArrs = {5, 1, 2, 3, 4};
        Arrays.sort(intArrs);
        System.out.println(Arrays.toString(intArrs));
    }
}
