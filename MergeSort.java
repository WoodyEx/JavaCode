/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MergeSort
{		
	public static void merge(int left[],int right[],int arr[]){
		int i=0,k=0,j=0;
		while(i<left.length && j<right.length){
			if(left[i]<right[j]){
				arr[k]=left[i];
				k++;i++;
			}
			else
			{
				arr[k]=right[j];
				j++;k++;
			}
		}
		while(i<left.length){
			arr[k]=left[i];
		k++;i++;
		}
		while(j<right.length){
			arr[k]=right[j];
		k++;j++;
		}
	}
	public static void mergeSort(int arr[]){
		int n=arr.length;
		if(n<2)return;
		int mid=n/2;
		int left[]=new int[mid];
		int right[]=new int[n-mid];
		int i=0;
		for(i=0;i<mid;i++){
			left[i]=arr[i];
			//System.out.println(i);
		}
		for(i=mid;i<n;i++){
			right[i-mid]=arr[i];
			//System.out.println(i);
		}
		mergeSort(left);
		mergeSort(right);
		merge(left,right,arr);
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		//MergeSort ms=new MergeSort();
		int arr[]=new int[10];
		Random rand=new Random(40);
		for(int i=0;i<10;i++){
			arr[i]=rand.nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}

