package Phase1Module3;


import java.util.Arrays;

public class LongestIncreasingSubsequence {
	public static void printLongestIncreasingSubsequence(int[] nums) {
		int n = nums.length;
		int[] d = new int[n];
		int[] lis = new int[n];
		int maxLen = 0, maxIndex = 0;
		for (int i = 0; i < n; i++) {
			d[i] = 1;
			lis[i] = i;
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j] && d[i] < d[j] + 1) {
					d[i] = d[j] + 1;
					lis[i] = j;
				}
			}
			if (d[i] > maxLen) {
				maxLen = d[i];
				maxIndex = i;
			}
		}
		int[] sequence = new int[maxLen];
		int index = maxIndex;
		for (int i = maxLen - 1; i >= 0; i--) {
			sequence[i] = nums[index];
			index = lis[index];
		}
		System.out.println("Original Array: " + Arrays.toString(nums));
		System.out.println("Longest Increasing Subsequence : "+ 
				Arrays.toString(sequence));
		System.out.println("Length of LIS: " + maxLen);
	}
	public static void main(String[] args) {
		int[] nums = {100, 30, 10, 60,70, 40, 80,90};
		printLongestIncreasingSubsequence(nums);
	}
}