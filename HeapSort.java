package sorting;

import java.util.Arrays;

public class HeapSort {
	
	public static void main(String[] args) {
	
		 int arr[] = {7,3,8,2,9,1,5}; 
	        int n = arr.length; 
	  
	        HeapSort heap = new HeapSort(); 
	        heap.sort(arr, n); 
	  
	        System.out.println("Sorted array" + Arrays.toString(arr)); 
	        
	}
	
	public void sort(int[] arr, int n) {
		
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i); 
  
        for (int i=n-1; i>=0; i--) 
        { 
        
            int temp = arr[0]; 
            arr[0] = arr[i]; 
            arr[i] = temp; 
  
            heapify(arr, i, 0); 
        } 	
	}
	
	   void heapify(int arr[], int n, int i) 
	    { 
	        int largest = i; 
	        int left = 2*i + 1; 
	        int right = 2*i + 2; 

	        if (left < n && arr[left] > arr[largest]) 
	            largest = left; 

	        if (right < n && arr[right] > arr[largest]) 
	            largest = right; 

	        if (largest != i) 
	        { 
	            int swap = arr[i]; 
	            arr[i] = arr[largest]; 
	            arr[largest] = swap; 

	            heapify(arr, n, largest); 
	        } 
	    } 
}
