package bai3_mang_va_phuong_thuc.bai_tap.max_mang;

public class MaxArray2Chieu {
    public static int max(int[][] arr){
        int max = arr[0][0];
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i ; j<arr[i].length; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] array = {
                {13,24,16},
                {9,6,15},
                {16,5,8}};
        System.out.println("Phan tu lon nhat trong mang 2 chieu la : " + max(array));
    }
}
