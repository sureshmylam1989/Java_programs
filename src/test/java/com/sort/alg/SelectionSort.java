package com.sort.alg;

public class SelectionSort {
	
	public int[] selectionSorting(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
		return arr;		
	}
	
	public int[] bubbleSorting(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		return arr;		
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {6,5,4,1,7,9,3};
		SelectionSort ss = new SelectionSort();
		int[] a;
		a= ss.selectionSorting(arr);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
	}

}
