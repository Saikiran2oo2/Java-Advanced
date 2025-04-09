package Arrays;

import java.util.Arrays;

public class RotateLeftToOnePlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {1,2,3,4,5};
		
		int temp=array[0];
		int n=array.length-1;
		for(int i=1;i<=n;i++) {
			array[i-1]=array[i];
		}
		array[n]=temp;
		System.out.println(Arrays.toString(array));

	}

}
