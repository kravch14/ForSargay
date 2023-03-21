package leetCode.hardTasks;

import java.util.Arrays;

public class MinimizeDeviationInArray {
    public static int minimumDeviation(int[] nums) {
        Arrays.sort(nums);
        int[] temp = Arrays.copyOf(nums, nums.length);
        System.out.println(Arrays.toString(nums));
        int minDeviation = nums[nums.length - 1] - nums[0];
        boolean flag = false;
        while (!flag) {
            if (nums[0] % 2 == 0) {
                nums[0] = nums[0] / 2;
            } else {
                nums[0] = nums[0] * 2;
            }
            Arrays.sort(nums);
            if ((nums[nums.length - 1] - nums[0]) < minDeviation) {
                minDeviation = nums[nums.length - 1] - nums[0];
            }
            if ((nums[nums.length - 1] - nums[0]) > minDeviation) {
                flag = true;
            }
        }
        flag = false;
        nums = Arrays.copyOf(temp, temp.length);
        int newMinDeviation = nums[nums.length - 1] - nums[0];
        while (!flag) {
            if (nums[nums.length - 1] % 2 == 0) {
                nums[nums.length - 1] = nums[nums.length - 1] / 2;
            } else {
                nums[nums.length - 1] = nums[nums.length - 1] * 2;
            }
            Arrays.sort(nums);
            if ((nums[nums.length - 1] - nums[0]) < newMinDeviation) {
                newMinDeviation = nums[nums.length - 1] - nums[0];
            }
            if ((nums[nums.length - 1] - nums[0]) > newMinDeviation) {
                flag = true;
            }
        }

        flag = false;
        nums = Arrays.copyOf(temp, temp.length);
        int newMinDeviation2 = nums[nums.length - 1] - nums[0];
        while (!flag) {
            if (nums[0] % 2 == 0) {
                nums[0] = nums[0] / 2;
            } else {
                nums[0] = nums[0] * 2;
            }
            if (nums[nums.length - 1] % 2 == 0) {
                nums[nums.length - 1] = nums[nums.length - 1] / 2;
            } else {
                nums[nums.length - 1] = nums[nums.length - 1] * 2;
            }
            Arrays.sort(nums);
            if ((nums[nums.length - 1] - nums[0]) < newMinDeviation2) {
                newMinDeviation2 = nums[nums.length - 1] - nums[0];
            }
            if ((nums[nums.length - 1] - nums[0]) > newMinDeviation2) {
                flag = true;
            }
        }
        minDeviation = Math.min(minDeviation, newMinDeviation);
        minDeviation = Math.min(minDeviation, newMinDeviation2);
        return minDeviation;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,5,20,3};
        System.out.println(minimumDeviation(nums));
    }
}
