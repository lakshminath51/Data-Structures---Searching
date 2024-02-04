package com.lakshminath.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int[][] arr = {
				{23,4,1},
				{18,12,3,9},
				{78,29,48,46},
				{18,12,46}
		};

		int target = 18;
		int[] ans = search(arr, target); // format of return value {row, column}
		System.out.println(Arrays.toString(ans));
		System.out.println(max(arr));
		System.out.println(maxUsingForEach(arr));
	}

	 static int[]  search(int[][] arr, int target) {
		 for(int row = 0; row < arr.length ; row++) {
			 for(int column = 0; column  < arr[row].length ; column++) {
				 if(arr[row][column] == target) {
					 return new int[] {row, column};
				 }
			 }
		 }
		return new int[] {-1,-1};
	}
	 
	 static int max(int[][] arr) {
		 int max = Integer.MIN_VALUE;
		 for(int row = 0; row < arr.length ; row++) {
			 for(int column = 0; column  < arr[row].length ; column++) {
				 if(arr[row][column] > max ) {
					 max = arr[row][column] ;
				 }
			 }
		 }
		return max;
	}
	 
	 //Using for each - Max
	 
	 static int maxUsingForEach(int[][] arr) {
		 int max = Integer.MIN_VALUE;
		 for(int[] ints : arr) {
			 for(int element : ints) {
				 if(element > max ) {
					 max = element ;
				 }
			 }
		 }
		return max;
	}

}
