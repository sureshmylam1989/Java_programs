package com.sort.alg;

public class BubbleSort {
	
	public int[] bubbleSorting(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		int[] arr = {6,5,4,1,7,9,3};
		BubbleSort bs = new BubbleSort();
		int[] a;
		a = bs.bubbleSorting(arr);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
