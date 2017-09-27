package mycode.java300.oop;
/**
 * 
 * Constructs the object of the class with the constructor
 * Initializes the object's properties
 * 
 * Define a Point class to represent a point in a three-dimensional space with three coordinates.
 * Generate point objects with specific coordinates.
 * Provide a way to set three coordinates.
 * Provide a way to calculate the distance from the point to another point.
 * 
 */
public class Point {
	double x, y, z;

	public Point(double _x, double _y, double _z) {
		x = _x;
		y = _y;
		z = _z;

	}
	
	public void setX(double _x) {
		x = _x;
	}
	
	public void setY(double _y) {
		x = _y;
	}
	
	public void setZ(double _z) {
		x = _z;
	}
	
	public double distance(Point p) {
		double result = Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z));
		return result;
	}

	public static void main(String[] args) {
		Point p = new Point(33,4,8);
		Point p2 = new Point(200,40,80);
		
		System.out.println(p.distance(p2));
	}
}
