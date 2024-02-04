package com.lakshminath.LinearSearch;

import java.util.Arrays;

public class SearchInStrings {

	public static void main(String[] args) {
		String name = "Lakshminath";
		char target  = 'm';
		
	//	System.out.println(search(name, target));
		System.out.println(Arrays.toString(name.toCharArray()));
		System.out.println(search2(name, target));
		

	}
	
	static boolean search(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == target) {
				return true;
			}
		}
		return false;
	}

	//Using for each
	static boolean search2(String str, char target) {
		if(str.length() == 0) {
			return false;
		}
		for(char ch : str.toCharArray()) {
			if(ch == target) {
				return true;
			}
		}
		return false;
	}
}
