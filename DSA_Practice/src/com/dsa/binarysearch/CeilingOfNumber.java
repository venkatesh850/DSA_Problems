package com.dsa.binarysearch;

public class CeilingOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 5, 9, 14, 16, 28 };
		// ceiling number of 15 is greater then the 15 or equal to 15
		int target = 15;
		System.out.println(ceilingNumber(arr, target));
	}

	// return an index where target element is equal to or greater of smallest
	// element
	// if target element is greater of greatest element then returnn -1
	static int ceilingNumber(int arr[], int target) {

		// return -1 bcz target element is greater than the greatest element
		if (target > arr[arr.length - 1]) {
			return -1;
		}
		int start = 0;
		int end = arr.length - 1;
		// condition for binary search

		while (start <= end) {
			int mid = start + (end-start)/2;

			if (target == arr[mid]) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			}
		}
		// start is contain the ceiling of a number
		return start;
	}

}
