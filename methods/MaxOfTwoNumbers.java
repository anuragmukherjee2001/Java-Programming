package methods;

public class MaxOfTwoNumbers {

	public static void main(String[] args) {
	
		int firstNumber = 34;
		int secondNumber = 23;
		
		int result1 = maxOf(firstNumber, secondNumber);
		int result2 = maxOf(100, 200);
		int result3 = maxOf(2,90);
		
		sayHi();
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}
	
	static int maxOf(int a, int b) {
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}
	static void sayHi() {
		System.out.println("Hello World");
		System.out.println("The Max of the numbers are");
	}

}
