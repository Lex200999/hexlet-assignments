package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        if(letters.length() < word.length()) {
            return false;
        }
        letters = letters.toLowerCase();
        word = word.toLowerCase();
        List<Character> listLettrs = new ArrayList<>();
        List<Character> listWord = new ArrayList<>();
        for (int i = 0; i < letters.length(); i++) {
            listLettrs.add(letters.charAt(i));
        }
        for (int i = 0; i < word.length(); i++) {
            listWord.add(word.charAt(i));
        }
        for (int i = 0; i < word.length(); i++) {
            if(listLettrs.contains(listWord.get(i))){
                for (int j = 0; j < letters.length(); j++) {
                    if(listWord.get(i) == listLettrs.get(j)){
                        listLettrs.set(j, '-');
                        break;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
