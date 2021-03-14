package bai16_io_text_file.bai_tap.doc_file_csv;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileTest {
    public static final String LINK_FILE = "src\\bai16_io_text_file\\bai_tap\\doc_file_csv\\file.csv";
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(LINK_FILE)));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
    }
}
