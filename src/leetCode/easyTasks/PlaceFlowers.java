package leetCode.easyTasks;

import java.util.Arrays;

public class PlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            boolean emptyLeft = ((i == 0) || (flowerbed[i - 1] == 0));
            boolean emptyRight = ((i == flowerbed.length - 1) || (flowerbed[i + 1] == 0));
            boolean isEmpty = flowerbed[i] != 1;
            if (isEmpty && emptyLeft && emptyRight) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        System.out.println(Arrays.toString(flowerbed));
        System.out.println("n = " + n);
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
