package com.consion.面试题;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 */
public class BTwoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4}; // target = 9
        int target = 6;
        System.out.println(Arrays.toString(twoSum2(nums, target)));

        //
        int i = 96;
        System.out.println(1 << 1);
    }

    /**
     * 暴力枚举法
     * 时间复杂度：O(n方)
     */
    private static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * 使用hash
     * 时间复杂度为O(n)
     */
    private static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int needValue = target - nums[i];
            if (map.containsKey(needValue)) {
                return new int[]{map.get(needValue), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }


}
