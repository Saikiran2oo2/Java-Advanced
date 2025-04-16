package Arrays.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Longest_consecutive_elements {

	public static void main(String[] args) {
		int[] a= {103,104,105,102,3,4,100,101,2,1};
		int b =bruitforce_Solution(a);
		System.out.println(b);
		int c =better_Solution(a);
		System.out.println(c);
		int d =optimal_Solution(a);
		System.out.println(d);

	}

	private static int optimal_Solution(int[] a) {
		int longest=1,count=0;
		Set<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for (Integer integer : set) {
			if(!set.contains(integer-1)) {
				count=1;
				int x=integer;
				while(set.contains(integer+1)) {
					count++;
					x++;
				}longest=Math.max(longest, count);
			}
		}
		
		return longest;
	}

	private static int better_Solution(int[] a) {
		Arrays.sort(a);
		
		int longest=1,count=0,lastSmaller=Integer.MIN_VALUE;
		for (int i : a) {
			if(i==lastSmaller) {
				count++;
				lastSmaller=i;
			} else if(i !=lastSmaller) {
				count=1;
				lastSmaller=i;
			}
		}
		longest=Math.max(longest, count);
		
		return longest;
	}

	private static int bruitforce_Solution(int[] a) {
		int longest=0;int count=0;
		for(int i=0;i<a.length;i++) {
			int x=a[i];
			count=0;
			while(linearSearch(a,x)==true) {
				x=x+1;
				count=count+1;
			}
			 longest = Math.max(longest, count);
		}
		return longest;
	}

	private static boolean linearSearch(int[] a, int x) {
		for (int i : a) {
			if(i==x) return true;
		}
		return false;
	}

}
