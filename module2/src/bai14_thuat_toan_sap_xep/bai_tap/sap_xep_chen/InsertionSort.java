package bai14_thuat_toan_sap_xep.bai_tap.sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int[] a){
        for (int i = 1; i < a.length; i++) {

            int curElement = a[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (curElement < a[j]) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }

            a[j + 1] = curElement;
        }

        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so luong phan tu ");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length ; i++){
            array[i] = input.nextInt();
        }
        insertionSort(array);
    }
}
