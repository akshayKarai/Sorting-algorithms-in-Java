package sorting;

class QuickSortIterative 
{ 
	public static void main(String args[]) 
	{ 
			 
		int arr[] = {7,3,8,2,9,1,5}; 
		int n = arr.length;
		
		quickSort(arr, 0, n-1); 

		System.out.println("Sorted array" + Arrays.toString(arr));
	} 
	
	static int partition(int arr[], int low, int high) 
	{ 
		int pivot = arr[high]; 
		int i = (low-1);
		for (int j=low; j<=high-1; j++) 
		{ 
			if (arr[j] <= pivot) 
			{ 
				i++; 

				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	} 

	static void quickSort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			int pivot = partition(arr, low, high); 

			quickSort(arr, low, pivot-1); 
			quickSort(arr, pivot+1, high); 
		} 
	} 

} 

