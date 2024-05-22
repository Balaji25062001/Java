package Classeight;

import java.util.Scanner;

public class ParseInts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0, val = 0;
		System.out.println("Enter a line: ");
		Scanner scanLine = new Scanner(sc.nextLine());
		while(scanLine.hasNext()) {
			try {
				val = Integer.parseInt(scanLine.next());
				sum += val;
			} catch(NumberFormatException e) {
 
			}
		}
 
		System.out.println("The sum of integers on the line is " + sum + ".");
		
		sc.close();
	}

}
