package patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of chsracters roes you want");
		
		int n = sc.next().charAt(0);
		
		for(char i = 'A'; i <= n; i++) {
			for(char j = 'A'; j <= n; j++) {
				System.out.print(i +" ");
			} 
			System.out.println(" ");
		}
		

	}

}
