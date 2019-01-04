package sorting;

import java.util.*;

public class BucketSort{
 
   public static void sort(int[] arr, int maxVal) {
	   
      int [] bucket=new int[maxVal+1];
 
      for (int i=0; i<bucket.length; i++) {
         bucket[i]=0;
      }
 
      for (int i=0; i<arr.length; i++) {
         bucket[arr[i]]++;
      }
 
      int pos=0;
      for (int i=0; i<bucket.length; i++) {
         for (int j=0; j<bucket[i]; j++) {
            arr[pos++]=i;
         }
      }
   }
 
   public static void main(String[] args) {

      int [] array= {2,5,3,6,1,8}; 
     
      int max = array[0]; 
      for (int i = 1; i < array.length; i++) 
          if (array[i] > max) 
              max = array[i];
      int maxVal = max;

      sort(array,maxVal);
      System.out.println("Sorted array" + Arrays.toString(array));
   }
}