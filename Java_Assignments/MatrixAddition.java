package zeroth;

import java.util.Scanner;

public class MatrixAddition {
	public static void main(String[] args) {
		
		int row_a, col_a, row_b, col_b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row and col for matrix A: ");
		row_a = sc.nextInt();
		col_a = sc.nextInt();
		
		System.out.println("Enter row and col for matrix B: ");
		row_b = sc.nextInt();
		col_b = sc.nextInt();
	
		if(row_a != row_b || col_a != col_b) {
			System.out.println("Matrix Addition not possible!");
			System.exit(1);
		}
		
		int mat_a[][] = new int[row_a][col_a]; 
		int mat_b[][] = new int[row_b][col_b]; 
		
		System.out.println("Enter values for matrix A: ");
		for(int i = 0; i < row_a; i++) {
			for(int j = 0; j < col_a; j++) {
				mat_a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter values for matrix B: ");
		for(int i = 0; i < row_b; i++) {
			for(int j = 0; j < col_b; j++) {
				mat_b[i][j] = sc.nextInt();
			}
		}
		
		int result[][] = new int[row_a][col_b];
		
		for(int i = 0; i < row_a; i++) {
			for(int j = 0; j < col_a; j++) {
				result[i][j] = mat_a[i][j] + mat_b[i][j];
			}
		}
		
		System.out.println("Result of matrix addition: ");
		for(int i = 0; i < row_a; i++) {
			for(int j = 0; j < col_a; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
