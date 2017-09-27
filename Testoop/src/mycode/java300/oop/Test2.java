package mycode.java300.oop;

public class Test2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Nick";
		s1.age = 18;
		
		Computer c =  new Computer();
		c.brand = "Lenvo";
		c.cpuSpeed = 100;
		s1.computer = c;
		c.brand = "Dell";
		
		System.out.println(s1.computer.brand);
	}

}
