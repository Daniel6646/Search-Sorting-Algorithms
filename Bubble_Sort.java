package Searching_Sorting_Algorithms;

public class Bubble_Sort {

	static void bubbleSort(int[] arr) {  
        int len = arr.length;  
        int temp = 0;  
         for(int i=0; i < (len); i++){  
                 for(int j=0; j < (len-1); j++){  
                          if(arr[j] > arr[j+1]){  
                                 //swap elements  
                                 temp = arr[j];  
                                 arr[j] = arr[j+1];  
                                 arr[j+1] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};  
                 
                System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);//sorting array elements using bubble sort  
                 
                System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  
	
