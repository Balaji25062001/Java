package Classeight;
import java.util.Scanner;
public class SumOfArray {
	
	

		// TODO Auto-generated method stub
       static int sum(int a,int[] b) {
    	   if(a==0)
    		   return b[a];
    	   return sum(a-1,b)+b[a];
       }
        public static void main(String[] args) {
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
