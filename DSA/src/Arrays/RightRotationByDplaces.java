package Arrays;

import java.util.Arrays;

public class RightRotationByDplaces {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int d=11;
		int n=arr.length;
		d=d%n;
		
		reverse(arr,0,4);
		System.out.println(Arrays.toString(arr));

	}

	private static void reverse(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while(end>start) {
			int temp=arr[end];
			arr[end]=arr[start];
			arr[start]=temp;
			end--;
			start++;
		}
		
	}

}
