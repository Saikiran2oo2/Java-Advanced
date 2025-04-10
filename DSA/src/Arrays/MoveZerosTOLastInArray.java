package Arrays;

import java.util.Arrays;

public class MoveZerosTOLastInArray {
	public static void main(String[] args) {
		int[] arr= {0,0,0,0,0,1,0,0,0,2,0,3,0,4,0,5,6};
		int n=arr.length;
		moveZerosToLast(arr,n);
		System.out.println(Arrays.toString(arr));
	}
	private static void moveZerosToLast(int[] arr, int n) {
		int nonZero=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				int temp=arr[nonZero];
				arr[nonZero]=arr[i];
				arr[i]=temp;
				nonZero++;
			}
		}
		
	}

}
