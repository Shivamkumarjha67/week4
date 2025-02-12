package ListOperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class FindingFrequency {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Raju");
        list.add("Pankaj");
        list.add("Shiv");
        list.add("Raju");
        list.add("Pankaj");
        list.add("Pankaj");

        HashMap<String, Integer> frequency = printOccurance(list);

        for(Entry<String, Integer> entry: frequency.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

//        System.out.println(frequency);
    }

    public static HashMap<String, Integer> printOccurance(List<String> list) {
        HashMap<String, Integer> frequency = new HashMap<>();

        for(String str : list) {
            frequency.put(str, frequency.getOrDefault(str, 0) + 1);
        }

        return frequency;
    }
}
