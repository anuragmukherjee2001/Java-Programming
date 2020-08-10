package oops.packages.models;

public class Teacher {
	
	public static void main(String[] args) {
		
		Student obj = new Student("Harry");//'public access modifiers' can be accessed everywhere
				
		obj.getClass(); //'default acess modifiers' can be accessed within that package only
	}

}
//private access modifiers can be accessed only within that class
//protected access modifier can be accessed on the parent class and the children class on any package