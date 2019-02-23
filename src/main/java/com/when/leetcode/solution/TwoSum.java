package com.when.leetcode.solution;

/**
 * @author: when
 * @create: 2019-02-23  10:57
 **/
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (equalsTarget(nums[i], nums[j], target)) {
					result[0] = i;
					result[1] = j;
				}
			}
		}
		return result;
	}

	public boolean equalsTarget(int m, int n, int target) {
		return m + n == target;
	}

	public int[] twoSumV2(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			int deviation = target - nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == deviation) {
					return new int[]{i, j};
				}
			}
		}
		throw new IllegalArgumentException("No such two numbers");
	}
}
