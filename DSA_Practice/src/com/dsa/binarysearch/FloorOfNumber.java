package com.dsa.binarysearch;

public class FloorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
		int target = 1;
		System.out.println(floorNumber(arr, target));

	}

	// return an index where target <= smallest of greater elements index
	// if target value is smaller of smallest element then return -1
	static int floorNumber(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;

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
		return end;
	}

}
