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

    /*

    .\.git
    .\.idea
    .\a_file.txt
    .\java-excercise-02.iml
    .\out
    .\README.md
    .\src

     */
}
