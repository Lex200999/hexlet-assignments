package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;

// BEGIN
public class App {
    public static String getForwardedVariables(String file){
        var sid = file.split("\n");
        String[] sid2 = new String[sid.length];
        for (int i = 0; i < sid.length; i++) {
            if(sid[i].startsWith("environment=")) {
                sid2[i] = sid[i];
            }
        }
        var sid3 = String.join(" ", sid2);
        var sid4 = sid3.split("\"|,");
        var result = Arrays.stream(sid4)
                //.map(x -> x.split(","))
               // .map(String::valueOf)
                .filter(x -> x.startsWith("X_FORWARDED_"))
                .map(x -> x.replaceAll("X_FORWARDED_", "").trim())
               // .map(String::valueOf)
                .collect(Collectors.joining(","));

        return result;
    }
}
//END
