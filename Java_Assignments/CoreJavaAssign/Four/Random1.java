package Classeight;

import java.util.Arrays;
import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int [10];
		int[] b = new int [10];
		Random rand = new Random();
		System.out.println("Random List");
		for(int i=0;i<10;i++) {
			int randno = rand.nextInt(100) +1;
			a[i]=randno;
			System.out.print(randno +" ");
		}
		System.out.println();

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorted list");
		for(int i = 0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}
}