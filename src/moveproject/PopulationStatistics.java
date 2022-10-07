package moveproject;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {

    public List<PopulationMove> readFileByLine(String filename) throws IOException {
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(filename)
        );


        String str;
        while ((str = bufferedReader.readLine()) != null) {
            //System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        bufferedReader.close();
        return pml;
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
        return new PopulationMove (Integer.valueOf(addresses[0]),Integer.valueOf(addresses[1])); // parsing
        // from이 전출, to가 전입
    }


    public String addressMaping(int addressInteger){
        Map<Integer, String> addressMap = new HashMap<>();

        // map에 시도 넣기
        addressMap.put(11,"서울특별시");
        addressMap.put(26, "부산광역시");
        addressMap.put(27, "대구광역시");
        addressMap.put(28, "인천광역시");
        addressMap.put(29, "광주광역시");
        addressMap.put(30, "대전광역시");
        addressMap.put(31, "울산광역시");
        addressMap.put(36, "세종특별자치시");
        addressMap.put(41, "경기도");
        addressMap.put(42, "강원도");
        addressMap.put(43, "충청북도");
        addressMap.put(44, "충청남도");
        addressMap.put(45, "전라북도");
        addressMap.put(46, "전라남도");
        addressMap.put(47, "경상북도");
        addressMap.put(48, "경상남도");
        addressMap.put(50, "제주특별자치도");



        return addressMap.get(addressInteger);
    }
    
    // 파일 생성하는 메소드
    public void CreateAFile(String filename){
        File file = new File(filename);

        try{
            file.createNewFile(); // 파일이 생성됨
        } catch(IOException e){
            throw new RuntimeException(e);
        }

    }

    // List<String>을 지정한 파일에 write
    public void write(List<String> strs, String filename){
        File file = new File(filename);

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter((file)));
            for (String str: strs){
                writer.write(str);
            }
            writer.close();

        } catch(IOException e){
            e.printStackTrace();
        }


    }

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromAddress() + "," + populationMove.getToAddress()+"\n";
    }


    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml){
        Map<String, Integer> moveCntMap = new HashMap<>();
        for(PopulationMove pm: pml){
            String key = pm.getFromAddress() + "," + pm.getToAddress();
            if (moveCntMap.get(key) == null){
                moveCntMap.put(key, 1);

            } else{
                moveCntMap.put(key, moveCntMap.get(key)+1);
            }
        }
        return moveCntMap;
    }

    public Map<String, Integer> heatmapIdxMap (){
        Map<String, Integer> map = new HashMap<>();
        map.put("11",0);
        map.put("26",1);
        map.put("27",2);
        map.put("28",3);
        map.put("29",4);
        map.put("30",5);
        map.put("31",6);
        map.put("36",7);
        map.put("41",8);
        map.put("42",9);
        map.put("43",10);
        map.put("44",11);
        map.put("45",12);
        map.put("46",13);
        map.put("47",14);
        map.put("48",15);
        map.put("50",16);

        return map;
    }


    public static void main(String[] args) throws IOException {
//        String fileLocation = "C:\\Users\\yeonji\\Desktop\\movedata\\2021_인구관련연간자료_20220927_66125.csv";
//
//        PopulationStatistics populationStatistics = new PopulationStatistics();
//        // populationStatistics.readFileByLine2(fileLocation); // static 하게 하지 않기 위해서는 인스턴스 불러와야함
//
//        String data = "50,130,62000,2021,12,20,26,350,52000,1,1,027,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,528528";
//        PopulationMove populationMove = populationStatistics.parse(data);
//        System.out.println(populationMove.getFromAddress());
//        System.out.println(populationMove.getToAddress());
//        System.out.println(populationStatistics.addressMaping(populationMove.getFromAddress()));
//
//        populationStatistics.CreateAFile("from_to.txt");
//
//        List<PopulationMove> pml = populationStatistics.readFileByLine(fileLocation);
//
//        List<String> strings = new ArrayList<>();
//
//        for (PopulationMove pm: pml){
//            String fromTo = populationStatistics.fromToString(pm);
//            strings.add(fromTo);
//        }
//        populationStatistics.write(strings, "./from_to.txt");

        String address = "./from_to.txt";
        PopulationStatistics populationStatistics= new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics.readFileByLine(address);

//        for (PopulationMove pm: pml){
//            System.out.printf("전입:%s, 전출:%s\n", pm.getFromAddress(), pm.getToAddress());
//        }

        Map<String, Integer> map = populationStatistics.getMoveCntMap(pml);
        Map<String, Integer> heatMapIdxMap = populationStatistics.heatmapIdxMap();

        String targetFileName = "for_heatmap.txt";
        populationStatistics.CreateAFile(targetFileName);
        List<String> cntResult = new ArrayList<>();
        for(String key: map.keySet()){
            String[] fromto = key.split(",");
            String s = String.format("[%s, %s, %d],", heatMapIdxMap.get(fromto[0]), heatMapIdxMap.get(fromto[1]), map.get(key));
            cntResult.add(s);
        }
        populationStatistics.write(cntResult, targetFileName);







    }
}
