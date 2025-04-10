package Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array= {1,2,3,4,5,6,7,8};
		int target=8;
		
		linearSearch(array,target);

	}

	private static void linearSearch(int[] array, int target) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length;i++) {
			if(array[i]==target) {
				System.out.println(" Target found at index: "+i);
			}
		}
		
	}

}
