package javaRush.task0908;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    private static HashMap<String, String> hashMapToBin;
    private static HashMap<String, String> hashMapToHex;

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

        hashMapToBin = new HashMap<>();
        hashMapToBin.put("0000", "0");
        hashMapToBin.put("0001", "1");
        hashMapToBin.put("0010", "2");
        hashMapToBin.put("0011", "3");
        hashMapToBin.put("0100", "4");
        hashMapToBin.put("0101", "5");
        hashMapToBin.put("0110", "6");
        hashMapToBin.put("0111", "7");
        hashMapToBin.put("1000", "8");
        hashMapToBin.put("1001", "9");
        hashMapToBin.put("1010", "a");
        hashMapToBin.put("1011", "b");
        hashMapToBin.put("1100", "c");
        hashMapToBin.put("1101", "d");
        hashMapToBin.put("1110", "e");
        hashMapToBin.put("1111", "f");
    }

    public static void main(String[] args) {
        String binaryNumber = "111100211010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        //String hexNumber = "9d0";
        //System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }
    public static String toHex(String binaryNumber) {

        StringBuilder sbOfHexNum = new StringBuilder();
        String result;
        try {
            StringBuilder sbOfBinNum = new StringBuilder(binaryNumber);
            int step = 1 + (binaryNumber.length() - 1) % 4;
            for (int i = 0; i < binaryNumber.length(); i += step, step = 4) {
                for (Map.Entry<String, String> pair : hashMapToBin.entrySet()) {
                    if (padLeftZeros(sbOfBinNum.substring(i, i + step), 4).equals(pair.getKey())) {
                        sbOfHexNum.append(pair.getValue());
                        break;
                    }
                }
            }
            result = sbOfHexNum.toString();
        } catch (Exception e) {
            result = "";
        }
        return result;
    }
    /*String hexNumber = "";
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
            for (Map.Entry<String, String> pair : hashMapToBin.entrySet()) {
                if (temp.equalsIgnoreCase(pair.getValue())) {
                    hexNumber = hexNumber + pair.getKey();
                    break;
                }
            }
            binaryNumber = binaryNumber.replaceFirst(temp, "");
        }
        return hexNumber;
    }
}*/
    public static String toBinary(String hexNumber) {
        String binaryNumber = "";
        if (Objects.equals(hexNumber, "") || hexNumber == null) {
            return binaryNumber;
        } else if (hexNumber.matches(".*[[^0-9]&&[^a-f]].*")) {
            return binaryNumber;
        } else {
            for (int i = 0; i < hexNumber.length(); i++) {
                for (Map.Entry<String, String> pair : hashMapToBin.entrySet()) {
                    if ((hexNumber.charAt(i) + "").equalsIgnoreCase(pair.getKey())) {
                        binaryNumber = binaryNumber + pair.getValue();
                        break;
                    }
                }
            }
            return binaryNumber;
        }
    }

    public static String padLeftZeros(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);

        return sb.toString();
    }
}
