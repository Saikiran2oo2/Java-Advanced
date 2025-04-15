package Arrays.Medium;

import java.util.Arrays;

public class Rearrange_Array_Elements {

	public static void main(String[] args) {
		int[] a= {-1,3,-2,-4,-5,4};
		int[] c=bruitForceSolution(a);
		System.out.println(Arrays.toString(c));

	}

	private static int[] bruitForceSolution(int[] a) {
		int size=a.length,posIndex=0,negIndex=1;
		int[] b=new int[size];
		for(int i=0;i<size;i++) {
			if(a[i] < 0 && negIndex < size) {
				b[negIndex]=a[i];
				negIndex+=2;
			}else if(a[i] >= 0 && posIndex < size) {
				b[posIndex]=a[i];
				posIndex+=2;
			}
		}
		return b;
	}

}
