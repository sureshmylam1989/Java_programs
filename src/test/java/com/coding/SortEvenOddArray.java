package com.coding;

public class SortEvenOddArray {
	
	/*
	 * This is under development
	 */
	public static void main(String[] args) {
		int[] arr = new int[] { 8,1, 2, 3, 4, 5, 6, 7 };
		int len = arr.length;
		int temp = 0;
		int next = 0;
		int endindex = len-1;;
		int startIndex = 0;
		int removenumber =-1;

		for (int i = 0; i < len; i++) {	
			if(i==0) {
				temp = arr[0];
			}
			if (temp % 2 == 0) {
				if(arr[endindex]==removenumber){
					endindex=endindex-1;
				}
				next = arr[endindex];
				arr[i]= removenumber;
				arr[endindex-1] = temp;
				
				endindex = endindex-1;
			} else {	
				if(arr[startIndex]==removenumber){
					startIndex=startIndex+1;
				}
				next = arr[startIndex];
				arr[startIndex]= removenumber;
				arr[startIndex-1] = temp;
				
				startIndex = startIndex+1;
			}
			temp = next;
		}
		for(int j=0;j<len;j++) {
			System.out.println(arr[j]);
		}
	}

}
