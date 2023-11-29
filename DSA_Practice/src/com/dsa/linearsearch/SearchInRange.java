package com.dsa.linearsearch;

public class SearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start=1;
		int end=4;
		int arr[] = {12,44,33,21,98,-7,9};
		int target = 33;
		System.out.println(searchInRange(arr,target,start,end));

	}
	static boolean searchInRange(int arr[], int target, int start,int end) {
		if(arr.length == 0) {
			return false;
		}
		
		for(int i=start;i<=end;i++) {
			if(arr[i] == target) {
				return true;
			}
		}
		return false;
	}

}
