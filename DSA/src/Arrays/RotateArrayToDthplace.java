package Arrays;

import java.util.Arrays;

public class RotateArrayToDthplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		int d=10,n=arr.length;
		int temp[]= {1,2,3};
		
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
		}
		int j=0;
		//why i=4--->length-d
		for(int i=n-d;i<n;i++) {
			arr[i]=temp[j];
			j++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
