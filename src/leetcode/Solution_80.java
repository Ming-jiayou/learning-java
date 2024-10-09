package src.leetcode;
public class Solution_80 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i;  // 遍历指针
        int j = 0;  // 新数组的长度指针
        int count = 1;  // 记录当前元素的重复次数

        for (i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;  // 返回新数组的长度
    }

    public static void main(String[] args) {
        Solution_80 solution = new Solution_80();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int newLength = solution.removeDuplicates(nums);
        System.out.println("新数组的长度: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}