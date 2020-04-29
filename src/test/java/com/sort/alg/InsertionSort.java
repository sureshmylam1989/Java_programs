package com.sort.alg;

public class InsertionSort {
	
	public int[] insertionSorting(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int current = arr[i];
			int j=i-1;
			while(j>=0 && current<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		return arr;
		
	}

	public static void main(String[] args) {
		int[] arr = {6,5,4,1,7,9,3};
		InsertionSort bs = new InsertionSort();
		int[] a;
		a = bs.insertionSorting(arr);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
