package classone;

import java.util.Scanner;
public class Buffer {
	
	 
	 
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a your full name : ");
	String a = sc.nextLine();
	String[] strArr = a.split("\\s");
	String result = new String();
	for(int i = 0; i < strArr.length; i++) {
	result = result + (strArr[i].substring(0, 1) + " ");
	}
	System.out.println(result);

	sc.close();
	}
	

}
