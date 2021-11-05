package thi_ket_thuc_md2.common;

import case_study.furama_resort.models.Customer;
import thi_ket_thuc_md2.models.BenhAn;
import thi_ket_thuc_md2.models.BenhAnThuong;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class InOutPut {
    public static void writeFile(String pathFile, String line) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String pathFile) throws IOException {
        List<String> benhAnList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(pathFile)));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        return benhAnList;
    }
}
