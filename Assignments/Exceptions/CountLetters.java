package Classeight;

import java.util.Scanner;

public class CountLetters {
	public static void main(String[] args) {
		int[] counts = new int [26];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a single word(letters only,please):");
		String word = sc.nextLine();
		word= word.toUpperCase();
		char index=0;
		try {
			for(int i=0;i<word.length();i++) {
				index = word.charAt(i);
				counts[index- 'A']++;
			}
			System.out.println();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println((char)index+" Not a letter " + e);
		}
		for(int i=0; i<counts.length;i++)
			if(counts [i] !=0 )
				System.out.println((char)(i+'A')+":"+counts[i]);
	}

}
