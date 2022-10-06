package fileupload;

import java.io.IOException;

public class ReadFileNByteMain {

    public static void main(String[] args) throws IOException {
        ReadFileNByte readFileNByte = new ReadFileNByte("./a_file.txt");

        System.out.println(readFileNByte.readNByte(2)); // 2글자
        System.out.println(readFileNByte.readNByte(5)); // 5글자

    }
}
