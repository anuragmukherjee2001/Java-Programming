package patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number of rows you want");
		
		int n = sc.nextInt();
		int p = n/2 + 1;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <=n; j++) {
				if(j == p || j == n - p +1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			if(i <= n/2) {
				p--;	
			}else {
				p++;
			}
			System.out.println("");
		}
		
		
		

	}

}
