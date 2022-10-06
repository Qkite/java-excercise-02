package ListExcer;

import java.util.HashSet;
import java.util.Set;

public class SetExcercise {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(); // tree set
        set1.add("김경록");
        set1.add("김경록");
        set1.add("김미미");
        set1.add("김나나");

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(1);
        setInteger.add(2);
        setInteger.add(3);
        setInteger.add(4);

        System.out.println(setInteger);
    }
}
