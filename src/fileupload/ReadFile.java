package fileupload;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {


    public static void bufferedReader(String filename) throws IOException{
        BufferedReader br = new BufferedReader(
                new FileReader(filename),
                16*1024
        );

        String line;


        System.out.println((char)br.read());
        System.out.println((char)br.read());
        System.out.println((char)br.read());
        System.out.println((char)br.read());
    }

    public static void main(String[] args) throws IOException {
        bufferedReader("./a_file.txt");
    }


}
