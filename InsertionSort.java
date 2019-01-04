package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {2,5,3,6,1,8,10,14,11};
		int n = arr.length;
		
		
		int result[] = insertionSort(arr, n);
		System.out.println("Sorted array" + Arrays.toString(result));

	}
	
	public static int[] insertionSort(int[] arr, int n){
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				while(arr[j] < arr[j-1]) {
					int temp = 0;
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;			
					
				}
			}
		}
		
		return arr;
	}

}
