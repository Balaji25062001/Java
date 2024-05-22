package Classeight;

import java.util.Scanner;

public class indexofsmallest {
	
	public static int sum(int index, int[] arr, int smallestValue , int smallestIndex) {
		if(index >= arr.length) {
			return smallestIndex ;
		}
		if (smallestValue > arr[index]) {
			smallestValue = arr[index];
			smallestIndex = index;
		}
		return sum(index+1,arr, smallestValue,smallestIndex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the array size : ");
    	int size= sc.nextInt();
    	System.out.println("Enter the array : ");
    	int arr[] =  new int[size];
    	for (int i = 0; i < size; i++) 
    	{
    		arr[i] = sc.nextInt();
    	}
    		
    		
    System.out.println("The Answer is : ");		
    System.out.println(sum (0,arr,arr[0],0));

	}

}
