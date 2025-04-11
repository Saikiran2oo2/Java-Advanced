package Arrays;

public class NonrepeatingElementInArray {

	public static void main(String[] args) {
		int[] a= {1,1,1,1,2,3,3,3,3,4,4,4,4};
		int xor=0;
		for(int i=0;i<a.length;i++) {
			xor=xor^a[i];
		}
		
		System.out.println(xor);

	}

}
