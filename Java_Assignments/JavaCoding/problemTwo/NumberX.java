package problemTwo;

import java.util.Scanner;

public class NumberX {
	
	
	
	
		public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("There are three options \n"
					+ "1.Check Prime or not \n"
					+ "2. Check Amstrong or not\n"
					+ "3. Check Palindrome or not\n");
			int option = sc.nextInt();
			int x = 0;
			switch(option) {
			case 1:
				System.out.println("Enter the number:");
				x=sc.nextInt();
				if(NumberX.checkPrime(x)) {
					System.out.println(x + " is a prime number.");
				} else {
					System.out.println(x + " is not a prime number.");
				}
				break;
			case 2:
				System.out.println("Enter the number:");
				x=sc.nextInt();
				if(NumberX.checkAmstrong(x)) {
					System.out.println(x + " is a Amstrong number.");
				} else {
					System.out.println(x + " is not a Amstrong number.");
				}
				break;
			case 3:
				System.out.println("Enter the number:");
				x=sc.nextInt();
				if(NumberX.checkPalindrome(x)) {
					System.out.println(x + " is a Palindrome number.");
				} else {
					System.out.println(x + " is not a Palindrome number.");
				}
				break;
					
				
				
			}
		}




		private static boolean checkPalindrome(int x) {
			// TODO Auto-generated method stub
			int num = x, rev = 0;
			while(x > 0) {
				int res = x % 10;
				rev = rev * 10 + res;
				x /= 10;
			}
			return num == rev ? true : false;
		}




		private static boolean checkAmstrong(int x) {
			// TODO Auto-generated method stub
			int num = x, sum = 0;
			int digits = (int) (Math.log10(x) + 1);
			while(x > 0) {
				int res = x % 10;
				sum += (Math.pow(res, digits));
				x /= 10;
			}
			return num == sum ? true : false;
		}




		private static boolean checkPrime(int x) {
			// TODO Auto-generated method stub
			for(int i=2;i<x;i++) {
				if(x % i == 0) {
					
					return false;
				}
			}
			return true;
		}
}
