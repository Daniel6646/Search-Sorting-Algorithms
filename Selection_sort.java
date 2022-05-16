package Searching_Sorting_Algorithms;

public class Selection_sort {

	  public static void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int smallest = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[smallest] > arr[j]){  
	                    smallest = j; //making the smaller number as smallest
	                }  
	            }  
	            int temp = arr[smallest];   
	            arr[smallest] = arr[i];  
	            arr[i] = temp;  //swapping the value of new smallest to arr[i] and vice versa
	            //refer this video
	            //   https://www.youtube.com/watch?v=PkJIc5tBRUE&t=1434s
	        }  
	    }  
	       
	    public static void main(String a[]){  
	        int[] arr1 = {9,14,3,2,43,11,58,22};  
	        System.out.println("Before Selection Sort");  
	        for(int i:arr1){  
	            System.out.print(i+" ");  
	        }  
	        System.out.println();  
	          
	        selectionSort(arr1);//sorting array using selection sort  
	         
	        System.out.println("After Selection Sort");  
	        for(int i:arr1){  
	            System.out.print(i+" ");  
	        }  
	    }  
	}
