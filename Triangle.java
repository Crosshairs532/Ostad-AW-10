package ostad_assignment_2;

public class Triangle extends Shape {
	
	public int base;
	public int h;
	
	
	public Triangle(int base, int h) {

		this.base = base;
		this.h = h;
	}
	@Override
	public
	void draw() {
		System.out.println("Triangle drawn");
	}
	@Override
	public double calculateArea() {
		
		return 0.5*this.base*this.h;
		
	}
}
