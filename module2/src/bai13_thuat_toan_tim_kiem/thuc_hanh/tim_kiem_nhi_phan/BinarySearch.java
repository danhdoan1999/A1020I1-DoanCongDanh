package bai13_thuat_toan_tim_kiem.thuc_hanh.tim_kiem_nhi_phan;

public class BinarySearch {
    static int[] list = {3,6,7,15,23,26,33,46};
    public static int binarySearch(int[] list, int key){
        int low = 0;
        int high = list.length - 1;
        while (high >= low){
            int mid = (low+high)/2;
            if (list[mid] < key){
                low = mid + 1;
            } else if(list[mid] == key){
                return mid;
            }else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,7));
    }
}
