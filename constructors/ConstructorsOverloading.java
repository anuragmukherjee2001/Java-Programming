package constructors;

class Vehicle2{
	
	int wheels;
	int headlights;
	String color;
	
	Vehicle2(int wheels){
		this.wheels = wheels;
		headlights = 2;
		
	}
	
	Vehicle2(int wheels , String color){
		this.wheels = wheels;
		this.color = color;
		headlights = 2;
	}
}


public class ConstructorsOverloading {

	public static void main(String[] args) {
		
		Vehicle2 car = new Vehicle2(4);
		Vehicle2 scooty = new Vehicle2(2);
		Vehicle2 rikshaw = new Vehicle2(3, "Yellow");
		
		System.out.println(car.wheels + " wheels");
		System.out.println(scooty.wheels + " wheels");
		System.out.println(rikshaw.wheels + " wheels and color " + rikshaw.color );

	}

}
