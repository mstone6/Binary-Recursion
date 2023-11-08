package Week6;

/**
 * @author Mushka Stone
 * Week 6 Recursive Binary
 * 11/7/2023
 * 
 * Question 3: Binary Search
 * Implement a recursive binary search algorithm. 
 * Given a sorted array of integers
 * write a function to find the index of a target value in the array
 * If the target value is not in the array, return -1.
 */

public class RecursiveBinarySearch {
	//Lets search an array of integers
	
	public static int binarySearch(int[]nums, int target, int left, int right) {
		if(left>right) {
			return -1; //Element not found
		}
		
		int middle = left +(right - left)/2;
		
		if(nums[middle]== target) {
			return middle; //the element was found
		}
		else if(nums[middle]<target) {
			//This searches the right half of the array
			return binarySearch(nums, target, middle + 1, right);
		}
		else {
			return binarySearch(nums, target, left, middle -1);
		}
	}
	
	
	
	public static void main(String[]args) {
		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		
		int s = nums.length; //This is the size of the array so the binary search can loop thru
		int x = 8; //This is the integer we are searching for
		
		int index = binarySearch(nums, x, 0, s - 1);
		
		//If the outcome is -1 we know the number x is not presetn
		if(index == -1) {
			System.out.println("The given value was not found in the array.");
		}else {
			System.out.println("The value " + x + " was found in the array at index: " + index + ".");
		}
	}
}

