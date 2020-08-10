package patterns;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers of rows you want");
		
		int n = sc.nextInt();
		int x = 1;
		for(int i = 1; i <= n; i++) {
			for(int j = n-1; j >= i; j--) {
				System.out.print(" ");
			}
			for(int k = 1;k <= i;k++) {
				System.out.print(x+" ");
				x++;
			}
			System.out.println(" ");
		}

	}

}
