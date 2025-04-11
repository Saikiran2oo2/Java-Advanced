package Arrays;

public class MaximumConsecutiveofOnes {

	public static void main(String[] args) {
		int[] a= {1,1,1,1,1,3,3,3,3,4,5,1,1,3,1,1,1,1,1,1,0};
		
		int ans=consecutiveOnes(a);
		System.out.println(ans);

	}

	private static int consecutiveOnes(int[] a) {
		int max=0,count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				count++;
				max=Math.max(max, count);
				}
			else count=0;
		}
		return max;
	}

}
