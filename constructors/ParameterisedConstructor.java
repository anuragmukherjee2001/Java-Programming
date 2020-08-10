package constructors;

class Vehicles{
	
	int wheels;
	
	Vehicles(int noOfWheels){
		wheels = noOfWheels;
		
	}
}

public class ParameterisedConstructor {
	
	
	public static void main(String[] args) {
		
		Vehicles car = new Vehicles(4);
		Vehicles scooty = new Vehicles(2);
		
		System.out.println(car.wheels + " wheels");
		System.out.println(scooty.wheels + " wheels");

	}

}
