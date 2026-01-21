package sample;

import myPackage.*;

public class TestPackage {

	public static void main(String[] args) {
		
		System.out.println("My java package");
		ExecuteStudent s1 = new ExecuteStudent();
		TestStudent t1 = new TestStudent();
		t1.setName("Sushant");
		System.out.println("Name : "+t1.getName());
		
		t1.setAge(19);
		System.out.println("Age : "+t1.getAge());

		
	}

}
