package com.dsa.linearsearch;

public class EvenDigitCount {

	public static void main(String[] args) {
		int[] nums = {18,124,9,1764,98,1};
		System.out.println(findNumbers(nums));

	}
	
	public static int findNumbers(int[] nums) {
		int count = 0;
		for(int num: nums) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}
	
	static boolean even(int num) {
		int digitsCount = digits(num);
		if(digitsCount %2 == 0) {
			return true;
		}
		return false;
	}
	
	static int digits(int nums) {
		int count = 0;
		while(nums>0) {
			count++;
			nums = nums/10;
		}
		return count;
	}

}
