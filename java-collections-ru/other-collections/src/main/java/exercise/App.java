package exercise;

import java.util.*;

// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> list1, Map<String, Object> list2) {
        var result = new LinkedHashMap<String, String>();
        list2.keySet().forEach(key ->{
            if(!list1.containsKey(list2)) {
                result.put(key, "added");
            }
        });
        list1.keySet().forEach(key ->{
            if(!list2.containsKey(list1)) {
                result.put(key, "deleted");
            }
        });
        list1.keySet().forEach(key ->{
            if(list2.containsKey(key)) {
                if (list1.get(key).equals(list2.get(key))) {
                    result.put(key, "unchanged");
                } else {
                    result.put(key, "changed");
                }
            }
        });
        return result;
    }
}
//END
