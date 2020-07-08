package com.srm.java8.parallelsorting;

import java.time.LocalDateTime;
import java.util.Arrays;

public class ArraysParallelSort {
	
	 public static void main(String[] args) {
		
		 ArraysParallelSort obj = new ArraysParallelSort();
		 obj.parallelSorting();
		 obj.ordinarySorting();
		
	 }
	 
	 
	 
	 private void parallelSorting(){
		
		 long starttime= System.currentTimeMillis();
		 
		int numbers[] = {22, 89, 1, 32, 19, 5};
		Arrays.parallelSort(numbers);
		Arrays.stream(numbers).forEach(n->System.out.println(n+" ")); 
		
		System.out.println("Parallel Sorting Start time : "+starttime+"     Parallel Sorting  End time : "+System.currentTimeMillis());
	  
		
	 }
	 	 
	 private void ordinarySorting(){
		 
		 long starttime= System.currentTimeMillis();
		
		 
		 int temp = 0; 
		 int arr[] = {22, 89, 1, 32, 19, 5};
	 
		  for (int i = 0; i < arr.length; i++) {     
	            for (int j = i+1; j < arr.length; j++) {     
	               if(arr[i] > arr[j]) {    
	                   temp = arr[i];    
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }  
		  
		  for (int i = 0; i < arr.length; i++) {     
	            System.out.println(arr[i] + " ");    
	        }    
		  
		 System.out.println("Ordinary Sorting Start time : "+starttime+"     Ordinary Sorting End time : "+System.currentTimeMillis()); 
	 }
	 
	 

}
