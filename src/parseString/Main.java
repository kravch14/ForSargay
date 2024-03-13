package parseString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = ";abcd;rty;;kli;";
        String[] arrayOfString = splitString(str, ';', true);
        for (String s: arrayOfString) {
            System.out.println(s);
        }
    }
    public static String[] splitString(String str, char separator, boolean keepEmpty) {
        List<String> list = new ArrayList<String>();
        int prevIndex = 0;

        while (true) {
            int newIndex = str.indexOf(separator, prevIndex);
            if (newIndex < 0) {
                String word = str.substring(prevIndex);
                if (!word.isEmpty() || keepEmpty) {
                    list.add(word);
                }
                return list.toArray(String[]::new);
            }
            String word = str.substring(prevIndex, newIndex);
            if (!word.isEmpty() || keepEmpty) {
                list.add(word);
            }
            prevIndex = newIndex + 1;
        }
    }
}