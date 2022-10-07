package moveproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

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
        return new PopulationMove (Integer.valueOf(addresses[6]),Integer.valueOf(addresses[0]));
        // from이 전출, to가 전입
    }


    public String addressMaping(int addressInteger){
        Map<Integer, String> addressMap = new HashMap<>();

        // map에 시도 넣기
        addressMap.put(11,"서울특별시");
        addressMap.put(21, "부산광역시");
        addressMap.put(22, "대구광역시");
        addressMap.put(23, "인천광역시");
        addressMap.put(24, "광주광역시");
        addressMap.put(25, "대전광역시");
        addressMap.put(26, "울산광역시");
        addressMap.put(29, "세종특별자치시");
        addressMap.put(31, "경기도");
        addressMap.put(32, "강원도");
        addressMap.put(33, "충청북도");
        addressMap.put(34, "충청남도");
        addressMap.put(35, "전라북도");
        addressMap.put(36, "전라남도");
        addressMap.put(37, "경상북도");
        addressMap.put(38, "경상남도");
        addressMap.put(39, "제주특별자치도");

        return addressMap.get(addressInteger);
    }

    public static void main(String[] args) throws IOException {
        String fileLocation = "C:\\Users\\yeonji\\Desktop\\movedata\\2021_인구관련연간자료_20220927_66125.csv";

        PopulationStatistics populationStatistics = new PopulationStatistics();
        // populationStatistics.readFileByLine2(fileLocation); // static 하게 하지 않기 위해서는 인스턴스 불러와야함

        String data = "50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528";
        PopulationMove populationMove = populationStatistics.parse(data);
        System.out.println(populationMove.getFromAddress());
        System.out.println(populationMove.getToAddress());
        System.out.println(populationStatistics.addressMaping(populationMove.getFromAddress()));

    }
}
