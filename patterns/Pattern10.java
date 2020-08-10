package patterns;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want");
		
		int n = sc.nextInt();
		
		for(int i = n; i >= -n; i--) {
			for(int j = n; j >= Math.abs(i); j--) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}

}
