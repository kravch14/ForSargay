package task0915;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution1 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        List<String> tokens = new ArrayList<String>(tokenizer.countTokens());
        while(tokenizer.hasMoreTokens())
        {
            tokens.add(tokenizer.nextToken());
        }
        return tokens.toArray(new String[tokens.size()]);
    }
}
