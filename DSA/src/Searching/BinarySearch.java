package Searching;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class BinarySearch{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[1000];
		

        // Instantiate a Random object
        Random random = new Random();

        // Fill the array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000); // Generates random numbers from 0 to 999
        }
        int target=854;
        int[] sorted=Arrays.stream(numbers).sorted().distinct().toArray();
        int result=linearSearch(sorted,target);
        int count=(int) Arrays.stream(sorted).count();
        System.out.println(count);
        
       
        
        if(result!=-1) {
        	System.out.println("Number found at index"+result);
        }
        else {
        	System.out.println("number not found");
        }

	}

	private static int linearSearch(int[] sorted, int target) {
		int steps=0;
		int left=0;
		int right=sorted.length;
		while(left<=right) {
			steps++;
		int mid=(left+right)/2;
		if(sorted[mid]==target) {
			System.out.println(steps);
			return mid;
		}
		else if(sorted[mid]<target)
			left=mid+1;
		else right=mid-1;
			
		}
		
		return -1;
	}

	

}
