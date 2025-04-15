package Arrays.Medium;

public class Mejority_of_elements {

	public static void main(String[] args) {
		int a[]= {2,2,3,2,5,6,7,2,2,2,1,1,1};
		int b=bruitForce(a);
		System.out.println(b);
		int c=optimal_Solution(a);
		System.out.println(c);

	}

	private static int optimal_Solution(int[] a) {
		int count=0;
		int ele=0;
		for(int i=0;i<a.length;i++) {
			if(count==0) {
				count=1;
				ele=a[i];
			}else if(a[i]==ele) {
				count++;
			}else count--;
		}
		int cnt=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				cnt++;
			}
		}
		if(cnt>(a.length/2)) return ele;
		return -1;
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
