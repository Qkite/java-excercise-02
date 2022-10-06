package fileupload;

import java.io.IOException;

public class ReadFile1LineMain {

    public static void main(String[] args) throws IOException {
        ReadFile1Line readFile1Line = new ReadFile1Line("./a_file.txt");

        System.out.println(readFile1Line.read1Line());

    }
}
