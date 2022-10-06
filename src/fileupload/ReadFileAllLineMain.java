package fileupload;

import java.io.IOException;

public class ReadFileAllLineMain {

    public static void main(String[] args) throws IOException {
        ReadFile1Line readFile1Line = new ReadFile1Line("./a_file.txt");
        readFile1Line.read1Line();

    }
}
