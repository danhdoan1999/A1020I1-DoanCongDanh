package bai2_vong_lap_trong_Java.bai_tap.ht_nguyen_to_nho_hon_100;

public class ShowPrime100 {
    public static void main(String[] args) {
        for (int i = 1 ; i < 100 ; i++){
            int count = 0;
            for (int j = 1 ; j <= i ; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(i + " ");
            }
        }
    }
}
