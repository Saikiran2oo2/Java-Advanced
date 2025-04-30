package BinarySearch;

public class MinimumInTheRoatedArray {

	public static void main(String[] args) {
		int[] arr= {4,5,6,7,1,2};
		int a=minimum_RotatedSortedArray_Search(arr);
		System.out.println(a);
		int b=rotatedTimes(arr);
		System.out.println(b);

	}

	private static int rotatedTimes(int[] arr) {
		int low=0,high=arr.length-1;
		while (low <= high) {
	        int mid = (low + high) / 2;
	        
	        // Check if mid is the rotation point (minimum element)
	        if (mid > 0 && arr[mid] < arr[mid - 1]) {
	            return mid;
	        }
	        
	        // Check if mid+1 is the rotation point
	        if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
	            return mid + 1;
	        }
	        
	        // If left part is sorted, search in right part
	        if (arr[low] <= arr[mid]) {
	            low = mid + 1;
	        } else { // Otherwise, search in left part
	            high = mid - 1;
	        }
	    }
	    
	    return 0;
	}

	private static int minimum_RotatedSortedArray_Search(int[] arr) {
		int low=0,high=arr.length-1,ans=Integer.MAX_VALUE;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[low]<=arr[mid]) {
				ans=Math.min(ans, arr[low]);
				low=mid+1;
			}else {
				ans=Math.min(ans, arr[mid]);
				high=mid-1;
			}
		}
		return ans;
	}

}
