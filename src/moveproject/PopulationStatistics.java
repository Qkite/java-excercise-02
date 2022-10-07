package moveproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {

    public void readFileByLine(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(filename)
        );


        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }

        bufferedReader.close();

    }

    public void readFileByLine2(String filename) {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){

            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }


    public void readByChar(String filename) throws IOException {

        FileReader fileReader = new FileReader(filename);

        // 여기까지는 파일을 읽어오지 않음

        // 100만개의 글자의 읽어보자 -> 매우 오래 걸림
        // 따라서 하나하나 읽는 것 보다는 BufferedReader를 사용해야 함

        String fileContents = "";
        while(fileContents.length()<1000000){
            char content = (char) fileReader.read(); // read를 했을 때 파일을 읽어옴
            fileContents += content;
            System.out.print(content);
        }
    }

    public PopulationMove parse(String data){
        String[] addresses = data.split(",");
        return new PopulationMove (Integer.valueOf(addresses[0]),Integer.valueOf(addresses[1]));
    }

    public static void main(String[] args) throws IOException {
        String fileLocation = "C:\\Users\\yeonji\\Desktop\\movedata\\2021_인구관련연간자료_20220927_66125.csv";

        PopulationStatistics populationStatistics = new PopulationStatistics();
        populationStatistics.readFileByLine2(fileLocation); // static 하게 하지 않기 위해서는 인스턴스 불러와야함

    }
}
