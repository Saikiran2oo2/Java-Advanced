package InterviewPrp;

import java.util.Arrays;

public class MaximumTripletValue {

	public static void main(String[] args) {
		// Return the maximum value over all triplets of indices (i, j, k) such that i < j < k. If all such triplets have a negative value, return 0.

//The value of a triplet of indices (i, j, k) is equal to (nums[i] - nums[j]) * nums[k].
		
		int nums[]= {12,6,1,2,7};
		int n=nums.length;
		int maxTrpletValue=0,maxPrefix=nums[0];
		for(int j=1;j<n-1;j++) {
			int maxdiff=maxPrefix - nums[j];
			int suffix=nums[j+1];
			for(int k=j+1;k<n;k++) {
				suffix=Math.max(suffix, nums[k]);
			}
			maxTrpletValue=Math.max(maxdiff*suffix, maxTrpletValue);
			maxPrefix=Math.max(maxPrefix, nums[j]);
		}
		System.out.println(maxTrpletValue);
		
		long a=streamsSolution(nums);
		System.out.println(a);
		

	}

	private static long streamsSolution(int[] nums) {
		long a=Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
		long b=Arrays.stream(nums).min().orElse(Integer.MIN_VALUE);
		long c=(a-b)*a;
		return c;
	}

}
