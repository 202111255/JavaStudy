public class Array07 {
    public static void main(String[] args) {
        //가변 배열
        int[][] arr1 = new int[3][];
        arr1[0] = new int[3];
        arr1[1] = new int[2];
        arr1[2] = new int[1];

        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[0][2] = 30;
    }
}
