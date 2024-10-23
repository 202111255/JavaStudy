public class Array05 {
    public static void main(String[] args) {
        //참조 자료형
        int[] arr1 = {10, 20, 30};
        System.out.println(arr1);
        int[] arr2 = arr1;
        arr1[1] = 100;
        System.out.println(arr2[1]);
    }
}
