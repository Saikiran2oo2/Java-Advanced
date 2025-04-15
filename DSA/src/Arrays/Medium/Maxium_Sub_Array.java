package Arrays.Medium;

public class Maxium_Sub_Array {

	public static void main(String[] args) {
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
	
		int a=bruit_Solution(nums);
		System.out.println(a);
		
		int b=better_Solution(nums);
		System.out.println(b);

	}

	private static int better_Solution(int[] nums) {
		int max=0;
		for(int i=0;i<nums.length;i++) {
			int sum=0;
			for(int j=i;j<nums.length;j++) {
					sum+=nums[j];max=Math.max(max, sum);
			}
			
		}
		return max;
	}

	private static int bruit_Solution(int[] nums) {
		int max=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i;j<nums.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=nums[k];
				}
				max=Math.max(max, sum);
			}
		}
		return max;
	}

}
