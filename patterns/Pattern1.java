package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number od stars you want");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++ ) {
			for(int j =1; j <=n; j++) {
				System.out.print("* ");	
			}
			System.out.println(" ");
		}

	}

}
