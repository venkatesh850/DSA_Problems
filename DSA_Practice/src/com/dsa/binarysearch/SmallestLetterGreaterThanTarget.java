package com.dsa.binarysearch;

public class SmallestLetterGreaterThanTarget {

	public static void main(String[] args) {
		char[] ch = {'c','f','j'};
		char target = 'j';
		System.out.println(smallestGreaterElement(ch, target));

	}
	
	static char smallestGreaterElement(char ch[], char target) {
		int start = 0;
		int end = ch.length-1;
		
		while(start <= end) {
			int mid = start + (end-start)/2;
			
			if(target<ch[mid]) {
				end = mid-1;
			}else{
				start = mid+1;
			}
		}
		return ch[start % ch.length];
	}

}
