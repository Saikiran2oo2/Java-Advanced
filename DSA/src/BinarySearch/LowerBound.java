package BinarySearch;

public class LowerBound {

	public static void main(String[] args) {
		int array[]= {1,2,3,3,4,5,5,6,6,8,8};
		int a=lowerBound(array,1);
		System.out.println(a);
		int b=upperBound(array,9);
		System.out.println(b);

	}

	private static int upperBound(int[] array, int x) {
		int low =0,high=array.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(array[mid]>x) {
				high=mid-1;
			}else low=mid+1;
		}
		return low;
	}

	private static int lowerBound(int[] array, int x) {
		int low=0,high=array.length-1;
		
		while(low<=high){
			int mid=(low+high)/2;
			if(array[mid]>=x) {
				high=mid-1;
			}else { low=mid+1;}
		}
		return low;
	}

}
