package fileupload;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileAllLine {


    private static String filename;

    // 클래스 생성자
    ReadFileAllLine(String filename) {
        this.filename = filename;
    }


    public static void read1Line() throws IOException{

        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16*1024
        );

        boolean IsEnoughLines = true;

        while (IsEnoughLines){

            if (br.readLine() == null){
                IsEnoughLines = false;
            } else{
                System.out.println(br.readLine());
            }
        }
    }



}
