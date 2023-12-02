package com.dsa.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
		int target = 90;
		System.out.println(binarySearch(arr, target));

	}

	// function to return an index
	static int binarySearch(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			} else if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			}
		}
		return -1;
	}

}
