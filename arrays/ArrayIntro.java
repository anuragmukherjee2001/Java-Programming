package arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		
		// int[] marks = new int[5];(declaration of arrays type 1)
		
//		int[] marks;
//		marks = new int[10](declaration of arrays type 2)

		int[] age = {1,2,4,5}; //initialising values in arrays
		age[1] = 14; //updating a value
		System.out.println("the updated value in the second position is" +age[1]);
		System.out.println(" ");
		for(int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
	}

}
