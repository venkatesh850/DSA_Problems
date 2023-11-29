package com.dsa.linearsearch;

import java.util.Arrays;

public class MaxValueIn2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{1,3,9},
				{12,99,18},
				{10,2,3}
		};
		System.out.println(maxValue(arr));

	}
	static int maxValue(int arr[][]) {
		int start = Integer.MIN_VALUE;
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]>start) {
					start = arr[row][col];
				}
			}
		}
		return start;
	}

}
