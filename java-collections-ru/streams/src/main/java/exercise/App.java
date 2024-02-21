package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    private static final List<String> FREE_DOMAINS = List.of(
            "gmail.com",
            "yandex.ru",
            "hotmail.com"
    );
    public static Integer getCountOfFreeEmails(List<String> list) {
        var result = list.stream()
                .filter(word ->{
                    var email = word.split("@");
                    var domains = email[1];
                    return FREE_DOMAINS.contains(domains);
                })
                .count();
        return Math.toIntExact(result);
    }
}
// END
