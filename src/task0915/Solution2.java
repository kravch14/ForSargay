package task0915;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/

public class Solution2 {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[stringTokenizer.countTokens()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stringTokenizer.nextToken();
        }
        return result;
    }
}