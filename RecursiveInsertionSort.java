package sorting;

import java.util.Arrays;

public class RecursiveInsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {20,5,3,6,1,8};
		int n = arr.length;
		
		int result[] = recursiveInsertionSort(arr, n);
		System.out.println("Sorted array "+ Arrays.toString(result));

	}
	
	public static int[] recursiveInsertionSort(int[] arr, int n) {
		
		if(n<=1) {
			return arr;
		}
		recursiveInsertionSort(arr,n-1);
		int last = arr[n-1];
		int j = n-2;
		while(j>=0 && arr[j] > last) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1]=last;
		
		return arr;
	}

}
