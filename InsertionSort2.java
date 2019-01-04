package sorting;

import java.util.Arrays;

public class InsertionSort2 {

	public static void main(String[] args) {
		
		int[] arr = {2,5,3,6,1,8};
		int n = arr.length;
		
		
		int result[] = insertionSort(arr, n);
		System.out.println("Sorted array" + Arrays.toString(result));

	}
	
	public static int[] insertionSort(int[] arr, int n){
		for(int i=1;i<n;i++) {
			int flag = arr[i];
			
			int j=i-1;
			System.out.println("j = "+ j);
			while( j>=0 && arr[j]>flag) {	
				
				 arr[j+1] = arr[j]; 
	                j = j-1;
				}
		
			arr[j+1] = flag; 
		
			}
		
		return arr;
	}

}
