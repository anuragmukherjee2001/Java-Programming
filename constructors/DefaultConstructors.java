package constructors;

class Vehicle{
	
	int wheels;
	int window;
	
	Vehicle(){
		wheels = 4;
		window = 4;
	}
}

public class DefaultConstructors {
	
	//DefaultConstructors(){  // no arguement constructor
		
		//System.out.println("object is now created");
	//}
	
	public static void main(String[] args) {
		
//		MyConstructors obj = new MyConstructors();
		Vehicle car = new Vehicle();
		Vehicle car2 = new Vehicle();
		
		System.out.println(car.wheels +" "+ "wheels");
		System.out.println(car2.window +" "+ "window");
	}

}
