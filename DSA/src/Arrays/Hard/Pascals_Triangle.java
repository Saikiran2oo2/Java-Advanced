package Arrays.Hard;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascals_Triangle {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int row=6;
		int col=4;
		int res=functionFor_NcR(row-1,col-1);
		System.out.println(res);

		List<Long> list= functionFor_Nth_Row(row);
		for (Long integer : list) {
			System.out.print(" "+integer);
		}System.out.println();
		List<List<Long>> result=pascle_Triangle_Printing(row);
		for (List<Long> list2 : result) {
			System.out.println(list2);
		}
		

	}

	private static List<List<Long>> pascle_Triangle_Printing(int row) {
		List<List<Long>> triangle = new ArrayList<>();
		for(int i=1;i<=row;i++) {
			triangle.add(functionFor_Nth_Row(i));
		}
		return triangle;
	}

	private static List<Long> functionFor_Nth_Row(int row) {
		long ans=1;
		List<Long> list=new ArrayList<>();
		list.add(ans);
		for(int i=1;i<row;i++) {
			ans=ans*(row-i);
			ans=ans/i;
			list.add(ans);
		}
		return list;
	}

	private static int functionFor_NcR(int row, int col) {
		int result=1;
		for(int i=0;i<col;i++) {
			result=result*(row-i);
			result=result/(i+1);
			
		}
		return result;
	}

}
