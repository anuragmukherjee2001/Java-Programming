package methods;

public class MethodOverloading {

	public static void main(String[] args) {
		
		int firstNumber = 34;
		int secondNumber = 23;
		int thirdNumber = 22;
		double fourthNumber = 44.3;
		
		int result1 = maxOf(firstNumber, secondNumber);
		int result2 = maxOf(100, 200);
		int result3 = maxOf(2,90);
		double result4 = maxOf(thirdNumber,fourthNumber);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		

	}
	static int maxOf(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	
	static double maxOf(int c, double d) {
		if(c > d) {
			return c;
		}else {
			return d;
		
	}
		
	}
	

}
