package leetcode;

import java.util.Arrays;

public class removeDuplicates {
    public static int removeDuplicate(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = removeDuplicate(nums);
        System.out.println("Length after removing duplicates: " + len);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOfRange(nums, 0, len)));
    }
}
