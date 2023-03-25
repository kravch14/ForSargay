package huckerRunk;

public class FindGroupInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(findGroupSum(array));

    }

    public static int findGroupSum(int[] array) {
        int groupLength = 4;
        int maxSum = 0;
        for (int i = 0; i <= array.length - groupLength; i++) {
            int tempSum = array[i] + array[i + 2] + array[i + 3];
            maxSum = Math.max(maxSum, tempSum);
        }
        return maxSum;
    }
}
