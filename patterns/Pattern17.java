package patterns;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want");
		
		int n = sc.nextInt();
		int p = n-1;
		int x = 1;
		
		for(int i = 1; i <= n; i++) {
			for(int m = 1; m <= n; m++) {
				System.out.print(" ");
			}
			for(int k = p; k >= i; k--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
			
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = p; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			for(int m = (n + n-2); m >=x; m--) {
				System.out.print(" ");
			}
			for(int k = 0;k <= i; k++) {
				System.out.print("* ");
			}
			x += 2;
			System.out.println("");
		}

	}

}
