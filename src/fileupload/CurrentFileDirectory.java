package fileupload;

import java.io.File;

public class CurrentFileDirectory {


    public static void main(String[] args) {
        File dir = new File("./"); // root directory
        File files[] = dir.listFiles();

        for (File file: files){
            System.out.println(file);
        }
    }
}
