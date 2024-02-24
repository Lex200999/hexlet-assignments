package exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> list) {
        var result = list.stream()
                .filter(word -> word.containsValue("male"))
                .sorted((name1, name2) -> name1.get("birthday").compareTo(name2.get("birthday")))
                .map(x -> x.get("name"))
                .toList();
        return result;
    }
}
// END
