package exercise;

import java.util.*;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if(sentence.equals("")) {
            Map<String, Integer> Map = new HashMap<>();
            return Map;
        }
        var arr = sentence.split(" ");
        List<String> list = new ArrayList<>();
        Collections.addAll(list, arr);
        return list.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.summingInt(word -> 1)));
    }
    public static String toString (Map<String,Integer> data) {
        if(data.isEmpty()) {
            return "{}";
        }
        String result = "{";
        for (Map.Entry<String, Integer> student: data.entrySet()) {
            String vin = "\n  " + student.getKey() + ": " + student.getValue() + "";
            result = result + vin;
        }
        result = result + "\n}";
        return result;
    }
}
//END
