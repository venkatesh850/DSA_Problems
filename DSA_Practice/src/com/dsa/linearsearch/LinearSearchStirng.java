package com.dsa.linearsearch;

public class LinearSearchStirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Venkatesh";
		char ch = 'a';
		System.out.println(linearSearchString(s,ch));

	}
	static int linearSearchString(String s, char ch) {
		if(s.isEmpty()) {
			return -1;
		}
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				return i;
			}
		}
		return -1;
	}

}
