package com.dsa.linearsearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int arr[][] = {
				{12,54,89,22},
				{34,98,21,90},
				{11,44}
		};
		int target = 44;
		int[] ans = searchIn2DArray(arr, target);
		System.out.println(Arrays.toString(ans));

	}
	
	static int[] searchIn2DArray(int arr[][], int target) {
		if(arr.length == 0) {
			return new int[] {-1,-1};
		}
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col] == target) {
					return new int[] {row,col};
				}
			}
		}
		return new int[] {-1,-1};
	}

}
