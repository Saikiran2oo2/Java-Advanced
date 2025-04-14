package Arrays.Medium;

public class Mejority_of_elements {

	public static void main(String[] args) {
		int a[]= {2,2,3,2,5,6,7,2,2,2};
		int b=bruitForce(a);
		System.out.println(b);

	}

	private static int bruitForce(int[] a) {
		
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<=i;j++) {
				if(a[j]==a[i]) {
					count++;
				}
			}
			if(count>a.length/2) {
				return a[i];
			}
		}
		return -1;
	}

}
