package javaBasics;

public class ReverseString {
	public static void main(String args[]) {
		
		String str="saiKiran";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		String str1=new StringBuffer(str).reverse().toString();
		
		System.out.println(str1);
	}

}
