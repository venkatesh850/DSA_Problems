package com.dsa.binarysearch;

public class AgnosticBinarySearchTree {

	public static void main(String[] args) {
		int[] arr = {12,34,46,68,90};
		int target = 12;
		System.out.println(agnosticBinarySearchTree(arr, target));
	}

	// function to return an index of an searching element
	static int agnosticBinarySearchTree(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			// check the array is sorted on ascending or descending while comparing first
			// end last ele
			if (target == arr[mid]) {
				return mid;
			}
			boolean isAscending = arr[start] <= arr[end];
			if (isAscending == true) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else if (target > arr[mid]) {
					start = mid + 1;
				}
			} else {
				if (target < arr[mid]) {
					start = mid + 1;
				} else if (target > arr[mid]) {
					end = mid - 1;
				}
			}
	}
	return -1;
	}

}
