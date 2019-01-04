package sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {7,3,8,2,9,1,5};
		int n = arr.length;
		int[] result = quickSort(arr, 0 , n-1);
		System.out.println("Sorted array" + Arrays.toString(result));

	}
	
	public static int[] quickSort(int[] arr, int least, int highest) {
		if(least< highest) {
			int pivot = pivotFunction(arr, least, highest);
			 quickSort(arr, least, pivot-1); 
	            quickSort(arr, pivot+1, highest); 
		}
		
		return arr;
	}
	
	public static int pivotFunction(int[] arr, int least, int highest) {
		int piv = arr[highest];
		int i = least-1;
		for(int j= least;j<highest;j++) {
			if(arr[j]<=piv) {
				i++;
				
				   int temp = arr[i]; 
	                arr[i] = arr[j]; 
	                arr[j] = temp;
			}
		}
		 int temp = arr[i+1]; 
	        arr[i+1] = arr[highest]; 
	        arr[highest] = temp; 
	  
	        return i+1;
	
	}

}
