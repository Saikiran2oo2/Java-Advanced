package Arrays.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maximum_Elements_Nby3 {

	public static void main(String[] args) {
		int[] arr= {1,1,1,1,3,3,2,2,2,4,4,4,5,5,6,6,6};
		int n=8;
		
		List<Integer> list=maxiumELements(arr,n);
		System.out.println(list);

	}

	private static List<Integer> maxiumELements(int[] arr,int n) {
		List<Integer> list=new ArrayList<>();
		Map<Integer, Integer> hash=new HashMap<>();
		int a=n/3;int min=a+1;
		System.out.println("Min value is: "+a);
		int l=arr.length;
		
		for(int i=0;i<l;i++) {
			 hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
			if(hash.get(arr[i])==min) {
				list.add(arr[i]);
			}
			if(list.size()==2) break;
		}
		return list;
	}

}
