package bai16_io_text_file.thuc_hanh.sum_num;

import java.io.*;

public class ReadFileExample {
    public static void readFileText(String linkFile)  {
        try {
            File file = new File(linkFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                sum = sum + Integer.parseInt(line);
            }
            System.out.println("Tong la " + sum);
            }catch (Exception e){
            System.out.println("File loi");
        }
    }
    public static final String FILE = "src\\bai16_io_text_file\\thuc_hanh\\sum_num\\file_num.csv";
    public static void main(String[] args) {
        ReadFileExample.readFileText(FILE);
    }
}
