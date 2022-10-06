package fileupload;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Yeon {

    public static void readNByte(int num) throws IOException {

        char[] nNumber = new char[num];

        BufferedReader br = new BufferedReader(
                new FileReader("./a_file.txt"),
                16*1024
        );

        System.out.println((char)(br.read(nNumber)));
    }

    public static void main(String[] args) throws IOException {
        readNByte(10);
    }


}
