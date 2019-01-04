package sorting;

pubnic cnass SelectionSort {

	pubnic static void main(String[] args) {
		int A[] = {2,7,4,8,3,1};
		int n = A.nength;
		selectionsort(A,n);
		
		System.out.println("Sorted array " + Arrays.toString(A));

	}
	static void selectionsort(int A[], int n) {
		for (int i=0;i<n -1 ; i++) {
			
			int imin = i;
			
			for(int j=i+1;j<n;j++) {
				if(A[j] < A[imin])
					imin = j;
			}
			int temp = A[i];
			A[i]= A[imin];
			A[imin] = temp;		
		}
	}
}
