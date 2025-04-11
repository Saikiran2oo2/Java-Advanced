package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UnionOfTwoSortedArrays {
	
	public static void main(String args[]) {
		int[] a= {1,2,2,3,4,4,5,6,7,7,7,7,7};
		int[] b= {1,2,3,4,6,8,9,10,11};
		
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(int i=0;i<b.length;i++) {
			set.add(b[i]);
		}
		int temp[]=new int[set.size()];
		int i=0;
		for (Integer element : set) {
			temp[i++]=element;
		}
		System.out.println(Arrays.toString(temp));
		List<Integer> temp1=optimalsolution(a,b);
		System.out.println(temp1);
		
		Arrays.sort(a);
		
	}

	private static List<Integer> optimalsolution(int[] a, int[] b) {
		List<Integer> union=new ArrayList<>();
		int i=0;
		int j=0;
		while(i<a.length && j<b.length) {
			if(a[i]<=b[i]) {
				union.add(a[i]);
				if(union.contains(a[i])) {
					  
				}
			}
		}
		return union;
	}

}
