package bai16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class TestReadWrite {
    public static final String LINK_FILE_SOURCE = "src\\bai16_io_text_file\\bai_tap\\copy_file_text\\source_file.csv";
    public static final String LINK_FILE_TARGET = "src\\bai16_io_text_file\\bai_tap\\copy_file_text\\target_file.csv";
    public static void main(String[] args) throws IOException {
        /*File file = new File(LINK_FILE_SOURCE);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);*/

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(LINK_FILE_SOURCE)));

        String line;
        while ((line = bufferedReader.readLine()) != null ){
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(LINK_FILE_TARGET),true));
            bufferedWriter.newLine();
            bufferedWriter.write(line);
            bufferedWriter.close();
            System.out.println(line);
        }

    }
}
