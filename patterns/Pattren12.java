package patterns;

import java.util.Scanner;

public class Pattren12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want");
		
		int n = sc.nextInt();
		int p = 1;
		
		for(int i = n; i >= -n; i--) {
			for(int j = 1; j<= Math.abs(i); j++){
				System.out.print(" ");
			}
			for(int k = n; k >= Math.abs(i); k--) {
				System.out.print(p+" ");
			}
			if(i > 0) {
				p++;
			}else {
				p--;	
			}
			System.out.println(" ");
		}
		
		

	}

}
