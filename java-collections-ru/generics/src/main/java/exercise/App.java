package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> list, Map<String, String> book) {
        var result = new ArrayList<>(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (!compareMaps(result.get(i), book)) {
                result.remove(i);
            }
        }
        return result;
    }
    public static boolean compareMaps(Map<String, String> map1, Map<String, String> map2) {
        return map1.entrySet().containsAll(map2.entrySet());
    }
}
//END
