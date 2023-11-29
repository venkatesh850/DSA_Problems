package com.dsa.linearsearch;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,45,87,33,21};
		int target = 22;
		System.out.println(linearSearch(arr,target));

	}
	static int linearSearch(int[] arr, int target) {
		if(arr.length ==0) {
			return -1;
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

}
