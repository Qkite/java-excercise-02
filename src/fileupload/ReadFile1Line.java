package fileupload;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1Line {


    private static String filename;

    // 클래스 생성자
    ReadFile1Line(String filename) {
        this.filename = filename;
    }


    public static String read1Line() throws IOException{

        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16*1024
        );

        return br.readLine();
    }



}
