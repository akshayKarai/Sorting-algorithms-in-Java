package sorting;

import java.util.Arrays;
public class BubbleSort {

	public static void main(String[] args) {
		int A[] = {1,5,4,3,9,8,7,10,7};
		int n = A.length;
		bubblesort(A, n);
	}
	static void bubblesort(int A[], int n) {
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(A[j]>A[j+1]) {
					temp = A[j];
					A[j]=A[j+1];
					A[j+1] = temp;
					System.out.println(Arrays.toString(A));
				}
			}
		}
		System.out.print("Sorted array" + Arrays.toString(A));
	}

}
