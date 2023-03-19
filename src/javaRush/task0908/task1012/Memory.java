package javaRush.task0908.task1012;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        List<String> list = new ArrayList<String>(array.length);
        for (String element : array) {
            if (element != null) {
                list.add(element);
            }
        }
        Arrays.fill(array, null);
        list.toArray(array);
    }
}
