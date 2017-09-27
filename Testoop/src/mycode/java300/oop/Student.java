package mycode.java300.oop;

public class Student {
	
	String name;
	int id;
	int age;
	String gender;
	int weight;
	Computer computer;
	
	public void study() {
		System.out.println(name + "is studying");;
	}
	
	public void sayHello(String sname) {
		System.out.println(name + " say hello to " + sname);
	}
}
