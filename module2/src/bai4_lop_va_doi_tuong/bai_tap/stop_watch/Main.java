package bai4_lop_va_doi_tuong.bai_tap.stop_watch;

import java.time.LocalTime;

public class Main {
    static void selectionSort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] a = new int [100000];
        for (int i = 0; i < 100000; i++) {
            a[i] = (int)(Math.random() * 100000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(a);
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
