package com.dsa.linearsearch;

public class LinearSearchElement {

	public static void main(String[] args) {
		int a[] = {10,22,54,89,-2,-4};
		int target = 00;
		System.out.println(linearSearchElement(a,target));

	}
	
	static int linearSearchElement(int a[], int target) {
		if(a.length==0) {
			return Integer.MAX_VALUE;
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == target) {
				return a[i];
			}
		}
		return Integer.MAX_VALUE;
	}

}
