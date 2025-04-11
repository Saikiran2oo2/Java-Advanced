package Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,4,5,6};
		
		int missingNumber=usingSumTechnique(a);
		System.out.println("Using Sum : "+missingNumber);
		int[] b= {1,2,4,5,6};
		int xor=usingXORtechnique(b);
		System.out.println("Using XOR : "+xor);

	}

	private static int usingXORtechnique(int[] b) {
		int xor1=0,xor2=0,n=b.length+1;
		for(int i=0;i<b.length;i++) {
			xor2=xor2^b[i];
			xor1=xor1^(i+1);
		}
		xor1 = xor1 ^ n;
		return xor1^xor2;
	}

	private static int usingSumTechnique(int[] a) {
		// n natural numbers
		int n=a.length+1;
		int naturalSum=(n*(n+1))/2;
		int loopSum=0;
		for(int i=0;i<a.length;i++) {
			loopSum+=a[i];
		}
		return (naturalSum-loopSum);
		
	}

}
