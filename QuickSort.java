/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class QuickSort
{		public static void quickSort(int arr[],int start,int end){
	 if(start<end){
	 	int partitionIndex=partition(arr,start,end);
	 	quickSort(arr,start,partitionIndex-1);
	 	quickSort(arr,partitionIndex+1,end);
	 	
	 }
	}
	public static int partition(int arr[],int start,int end){
		
		int pivot=arr[end];
		int pindex=start,temp=0;
		for(int i=start;i<end;i++){
			if(arr[i]<=pivot){
				temp=arr[i];arr[i]=arr[pindex];arr[pindex]=temp;
				pindex++;
			}
		}
		temp=arr[end];arr[end]=arr[pindex];arr[pindex]=temp;
		return pindex;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int arr[]=new int[10];
		Random rand=new Random(42);
		for(int i=0;i<10;i++){
			arr[i]=rand.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		quickSort(arr,0,9);
		System.out.println(Arrays.toString(arr));
	
	}
}

