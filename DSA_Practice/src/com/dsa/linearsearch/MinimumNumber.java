package com.dsa.linearsearch;

public class MinimumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {21,78,55,89};
		System.out.println(minimumNumber(arr));

	}
	static int minimumNumber(int arr[]) {
		
		int ans = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<ans) {
				ans = arr[i];
			}
		}
		return ans;
	}

}
