package conceptual;

public class B1 {
	
private static int i = 0;
private static int j = 0;

	public static void main(String[] args) {
		int i = 3;
		int k = 4;
		
		{
			int j = 2;
			System.out.println("i + j is"+i +j);
		}
//		char a = '2';
//		int b  = 8;
//		System.out.println(a+b);
		k = i + j;
		System.out.println(k);
		System.out.println(j);
	}

}
