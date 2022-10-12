package codeup;


import java.util.*;

public class Excercise3108 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numOfCodes = scan.nextInt();

        Map<String, String> mountainMap = new TreeMap<>();

        // 2~n+1 까지
        for (int i=0; i<numOfCodes; i++){
            String inputCode = scan.next();
            String[] inputs= inputCode.split(" ");

            if (inputs[0] == "I"){
                if (mountainMap.get(inputs[1]) == null){
                    mountainMap.put(inputs[1], inputs[2]);
                } else{
                    continue;
                }
            } else if (inputs[0]=="D") {
                if (mountainMap.get(inputs[1]) == null){
                    continue;
                } else{
                    mountainMap.remove(inputs[1]);
                }
            }
        }

        String[] orders = scan.next().split(" ");
        Set<String> mountainKeySet = mountainMap.keySet();

        String[] mountainKeys = mountainKeySet.toArray(new String[0]);



        for (String order:orders) {

            System.out.println(order + " " + mountainMap.get(order));

        }




    }


}
