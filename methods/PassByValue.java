package methods;

public class PassByValue {

	public static void main(String[] args) {
		
		int c = 34;
		int d = 22;
		
		swap(c , d);
		
		System.out.println(c);
		System.out.println(d);
	}
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

}
