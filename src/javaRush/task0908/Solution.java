package javaRush.task0908;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

    public static void main(String[] args) {
        String binaryNumber = "111100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }
    public static String toHex(String binaryNumber) {
        String hexNumber = "";
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("0", "0000");
        hashMap.put("1", "0001");
        hashMap.put("2", "0010");
        hashMap.put("3", "0011");
        hashMap.put("4", "0100");
        hashMap.put("5", "0101");
        hashMap.put("6", "0110");
        hashMap.put("7", "0111");
        hashMap.put("8", "1000");
        hashMap.put("9", "1001");
        hashMap.put("a", "1010");
        hashMap.put("b", "1011");
        hashMap.put("c", "1100");
        hashMap.put("d", "1101");
        if (Objects.equals(binaryNumber, "") || binaryNumber == null) {
            return hexNumber;
        } else if (binaryNumber.matches(".*[^01].*")) {
            return hexNumber;
        } else {
            if (binaryNumber.length() % 4 != 0) {
                int originLength = binaryNumber.length() % 4;
                for (int i = 0; i < 4 - originLength; i++) {
                    binaryNumber = 0 + binaryNumber;
                }
            }
            while (!Objects.equals(binaryNumber, "")) {
                String temp = binaryNumber.substring(0, 4);
                for (Map.Entry<String, String> pair : hashMap.entrySet()) {
                    if (temp.equalsIgnoreCase(pair.getValue())) {
                        hexNumber = hexNumber + pair.getKey();
                        break;
                    }
                }
                binaryNumber = binaryNumber.replaceFirst(temp, "");
            }
            return hexNumber;
        }
    }
    public static String toBinary(String hexNumber) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("0", "0000");
        hashMap.put("1", "0001");
        hashMap.put("2", "0010");
        hashMap.put("3", "0011");
        hashMap.put("4", "0100");
        hashMap.put("5", "0101");
        hashMap.put("6", "0110");
        hashMap.put("7", "0111");
        hashMap.put("8", "1000");
        hashMap.put("9", "1001");
        hashMap.put("a", "1010");
        hashMap.put("b", "1011");
        hashMap.put("c", "1100");
        hashMap.put("d", "1101");
        String binaryNumber = "";
        if (Objects.equals(hexNumber, "") || hexNumber == null) {
            return binaryNumber;
        } else if (hexNumber.matches(".*[[^0-9]&&[^a-f]].*")) {
            return binaryNumber;
        } else {
            for (int i = 0; i < hexNumber.length(); i++) {
                for (Map.Entry<String, String> pair : hashMap.entrySet()) {
                    if ((hexNumber.charAt(i) + "").equalsIgnoreCase(pair.getKey())) {
                        binaryNumber = binaryNumber + pair.getValue();
                        break;
                    }
                }
            }
            return binaryNumber;
        }
    }
}
