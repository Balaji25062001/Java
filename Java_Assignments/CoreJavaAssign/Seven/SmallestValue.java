package Classeight;

import java.util.Scanner;

public class SmallestValue {
	static int sum(int a, int[] b) {
		if(a ==0)
			return b[a];
		return  b[a] < sum(a-1,b)? b[a]: sum (a-1,b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    	System.out.print("Enter the array size : ");
    	int a= sc.nextInt();
    	System.out.println("Enter the array : ");
    	int b[] =  new int[a];
    	for (int i = 0; i < a; i++) 
    	{
    		b[i] = sc.nextInt();
    	}
    		
    		
    System.out.println("The Answer is : ");		
    System.out.println(sum (a-1,b));

	}

}
