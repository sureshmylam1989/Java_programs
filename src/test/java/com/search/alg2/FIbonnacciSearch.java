package com.search.alg2;

public class FIbonnacciSearch {


	public static int fibMonaccianSearch(int arr[], int x, int n) {
		int fibMMm2 = 0;
		int fibMMm1 = 1;
		int fibM = fibMMm2 + fibMMm1;
		int offset=0;
		
		while(fibM<n) {
			fibMMm2 =fibMMm1;
			fibMMm1=fibM;
			fibM = fibMMm1+fibMMm2;
		}
		
		while(fibM>1) {
			int i = Math.min(offset+fibMMm2, n-1);
			
			if(arr[i]<x) {
				fibM=fibMMm1;
				fibMMm1 = fibMMm2;
				fibMMm2 = fibM-fibMMm1;
				offset = i;
			}else if(arr[i]>x){
				fibM = fibMMm2;
				fibMMm1 = fibMMm1-fibMMm2;
				fibMMm2 = fibM-fibMMm2;				
			}else {
				return i;
			}
			
		}

		return -1;
	}

	// driver code
	public static void main(String[] args) {
		int arr[] = { 10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100 };
		int n = 11;
		int x = 10;
		System.out.print("Found at index: " + fibMonaccianSearch(arr, x, n));
	}
}
