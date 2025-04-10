package Arrays;

import java.util.Arrays;

public class RotateArrayToDthplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int d=2,n=arr.length;
		 d = d % n;
		
		  System.out.println(Arrays.toString(arr)+"\n\n"); // rotating array from 0 to d-1
		  //then after reverse array will be like this {[7, 6, 5, 4, 1, 2, 3]}
		  optimalSolutionUsingReverse(arr,0,n-1-d);
		  optimalSolutionUsingReverse(arr,n-d,n-1);
		  optimalSolutionUsingReverse(arr,0,n-1);
		  System.out.println(Arrays.toString(arr));
		  
		  System.out.println("\n\n");
		  int arr1[]= {1,2,3,4,5,6,7};
		  System.out.println(Arrays.toString(arr1)+"\n second array for left shift\n");
		  optimalSolutionUsingReverse(arr1,0,d-1);
		  optimalSolutionUsingReverse(arr1,d,n-1);
		  optimalSolutionUsingReverse(arr1,0,n-1);
		  System.out.println(Arrays.toString(arr1));


	}

	private static void optimalSolutionUsingReverse(int[] arr, int start, int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
	}
}
