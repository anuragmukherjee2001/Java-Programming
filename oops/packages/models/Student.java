package oops.packages.models;

public class Student {
	
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public String getName() {
		getPassword();
		return name;
	}
	private String getPassword() {
		return "davison";
	}
	
	String className() {
		return "seventh";
	}
}
