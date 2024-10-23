public class Array06 {
    public static void main(String[] args) {
        //2차원 배열의 선언
        int[][] arr1;
        //int arr2[][];
        //int[] arr3[];

        //배열의 생성
        arr1 = new int[3][2];

        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[1][0] = 30;
        arr1[1][1] = 40;
        arr1[2][0] = 50;
        arr1[2][1] = 60;

        System.out.println(arr1[0][0]);
        System.out.println(arr1[2][1]);

        //선언, 생성, 초기화
        int[][] arr2 = new int[][] {{10, 20}, {30, 40}, {40, 50}};
        int[][] arr3 = {{10, 20}, {30, 40}, {40, 50}};

        //행의 개수
        System.out.println(arr2.length);

        //열의 개수
        System.out.println(arr3[0].length);

        //향상된 for로 2차원 배열 출력
        for (int[] cols : arr1) {
            for (int data : cols) {
                System.out.println(data);
            }
        }
    }
}
