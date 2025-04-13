package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// a={1,2,3,6,7,8,11} target=14 --->adding 2 array elements should be equal to
		// target

		int[] a = { 1, 2, 6, 7, 5, 8, 11 };
		int target = 14;
		twoSum(a, target);

		System.out.println("With HashMap : "+betterWIthHashMap(a, target));
		
		System.out.println("without hashmap two sum is: "+withOutHashMap(a,target));

	}

	private static String withOutHashMap(int[] a, int target) {
		Arrays.sort(a);
		int left=0,right=a.length-1;
		while(left<right) {
			int sum=a[left]+a[right];
			if(sum== target) return "Yes";
			else if(sum<target) left++;
			else right--;
		}
		return "No";
	}

	private static String betterWIthHashMap(int[] a, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int more = target - a[i];

			if (map.containsKey(more)) {
				return map.getOrDefault(more, -1) + "," + i;
			}

			map.put(a[i], i);
		}
		return "No";
	}

	private static void twoSum(int[] a, int target) {
		String b;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {

				if (i == j)
					continue;
				if (a[i] + a[j] == target) {
					System.out.println("Yes " + i + " " + j);
					break;
				}
			}
		}
		System.out.println("No");

	}

}
