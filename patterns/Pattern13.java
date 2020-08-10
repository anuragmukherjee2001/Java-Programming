package patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want");
		
		int n = sc.nextInt();
		int p = n;
		int q = n;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n*2; j++) {
				if(j == p || j == q) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			p--;
			q++;
			
			System.out.println(" ");
		}

	}

}
