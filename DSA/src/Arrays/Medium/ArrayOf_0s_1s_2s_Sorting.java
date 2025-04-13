package Arrays.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayOf_0s_1s_2s_Sorting {

	public static void main(String[] args) {
		int[] a= {0,1,1,0,0,2,1,2,0,1,0,0};
		String[] c= {"ss","gg"};
		int[] b=using_Dutch_National_Flag_Algorithm(a);
		System.out.println(Arrays.toString(b));
	}

	private static int[] using_Dutch_National_Flag_Algorithm(int[] a) {
		int low=0,mid=0,high=a.length-1;
		for(int i=0;i<a.length;i++) {
			//if(a[mid]==0 && a[low]==0) low++;mid++;
			
			if(a[mid]==0) {
				int temp=a[mid];
				a[mid]=a[low];
				a[low]=temp;
				low++;mid++;
			}
			
			else if(a[mid]==1){
				mid++;
			}else if(a[mid]==2) {
				int temp=a[mid];
				a[mid]=a[high];
				a[high]=temp;
				high--;
			}
		}
		return a;
	}

}
