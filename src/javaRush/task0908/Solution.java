package javaRush.task0908;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    private static final HashMap<String, String> hashMapToBin;
    private static final HashMap<String, String> hashMapToHex;

    static {
        hashMapToBin = new HashMap<>();
        hashMapToBin.put("0", "0000");
        hashMapToBin.put("1", "0001");
        hashMapToBin.put("2", "0010");
        hashMapToBin.put("3", "0011");
        hashMapToBin.put("4", "0100");
        hashMapToBin.put("5", "0101");
        hashMapToBin.put("6", "0110");
        hashMapToBin.put("7", "0111");
        hashMapToBin.put("8", "1000");
        hashMapToBin.put("9", "1001");
        hashMapToBin.put("a", "1010");
        hashMapToBin.put("b", "1011");
        hashMapToBin.put("c", "1100");
        hashMapToBin.put("d", "1101");
        hashMapToBin.put("e", "1110");
        hashMapToBin.put("f", "1111");

        hashMapToHex = new HashMap<>();
        for (Map.Entry<String, String> pair: hashMapToBin.entrySet()) {
            hashMapToHex.put(pair.getValue(), pair.getKey());
        }
    }

    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String input) {
        StringBuilder result = new StringBuilder();
        try {
            int step = 1 + (input.length() - 1) % 4;
            for (int i = 0; i < input.length(); i += step, step = 4) {
                String part = padLeftZeros(input.substring(i, i + step), 4);
                result.append(partToHex(part));
            }
            return result.toString();
        } catch (Exception e) {
            return "";
        }
    }

    public static String toBinary(String input) {
        StringBuilder result = new StringBuilder();
        try {
            for (int i = 0; i < input.length(); i++) {
                String part = input.substring(i, i + 1);
                result.append(partToBin(part));
            }
            return result.toString();
        } catch (Exception e) {
            return "";
        }
    }

    public static String padLeftZeros(String input, int length) {
        int missingLength = length - input.length();
        if (missingLength <= 0)
            return input;
        return "0".repeat(missingLength) + input;
    }

    public static String partToHex(String part) {
        String result = hashMapToHex.get(part);
        return Objects.requireNonNull(result, "Unable to convert binary string to hex string. Details: " + part);
    }

    public static String partToBin(String part) {
        String result = hashMapToBin.get(part);
        return Objects.requireNonNull(result, "Unable to convert hex string to binary string. Details: " + part);
    }
}
