public class Array03 {
    public static void main(String[] args) {
        //배열의 속성
        //방의 갯수

        int[] arr1 = {10, 20, 30, 40, 50};
        //int[] arr2 = {10, 20, 30};


        System.out.println("개수 : " + arr1.length);

        //배열의 출력 - 일반적인 방법
        for (int i=0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        //배열의 출력 - 향상된 방법
        for (int data : arr1) {
            System.out.println(data);
        }
        
    }
}
