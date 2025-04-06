package javaBasics;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=16;
		if(num<=1) {
			System.out.println("Not a Prime Number");
			
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("Not a Prime Number");
			}
		}
		System.out.println("It is a Prime Number");

	}

}
