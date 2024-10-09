package src.leetcode;
import java.util.Arrays;
public class Solution_189 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // 处理k大于数组长度的情况
        
        // 反转整个数组
        reverse(nums, 0, n - 1);
        // 反转前k个元素
        reverse(nums, 0, k - 1);
        // 反转剩下的元素
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        rotate(nums, k);
        
        System.out.println(Arrays.toString(nums));
    }
}
