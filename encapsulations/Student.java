package encapsulations;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age > 20) {
			System.out.println("You are too old for a nursery student");
		}else {
		this.age = age;
		}	
	}

		
	
	
	

}
