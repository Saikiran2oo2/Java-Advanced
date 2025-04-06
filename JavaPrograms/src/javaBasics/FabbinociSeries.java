package javaBasics;

public class FabbinociSeries {
	public static void main(String args[]) {
		int n1=0,n2=1;
		for(int i=0;i<=10;i++) {
			int n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
	}

}
