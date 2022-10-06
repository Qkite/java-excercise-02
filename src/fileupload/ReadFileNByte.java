package fileupload;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileNByte {


    private static String filename;


    // 클래스 생성자
    ReadFileNByte(String filename) {
        this.filename = filename;
    }


    public static char[] readNByte(int num) throws IOException{

        char[] nNumber = new char[num];

        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16*1024
        );

        for (int i=0; i<num; i++){
            nNumber[i] = (char)(br.read(nNumber));
        }

        return nNumber;
    }



}
