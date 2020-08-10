package patterns;

import java.util.Scanner;

public class Patterns9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you wamt");
		
		int n = sc.nextInt();
		int s = n * 2-1;
		int p = n-1;
		
		for(int i = n; i >= 1; i--) {
			for(int j = p; j >= i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= s; j++) {
				System.out.print(i);
			}
			s -= 2;
			System.out.println(" ");
		}
		
		

	}

}
