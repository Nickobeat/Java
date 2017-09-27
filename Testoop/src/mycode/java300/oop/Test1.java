/**
 *
 * Use new as keyword to create an object of the class
 * Use object(reference).member variable to refer to member variable of object
 * Use the object (reference) method(parameter list) to call the object's method
 * 
 */
package mycode.java300.oop;

public class Test1 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Nick";
		s1.study();
		s1.sayHello("Kobe");
		
		Student s2 = new Student();
		s2.age = 18;
		s2.name = "James";
	}

}
