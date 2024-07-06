package ostad_assignment_2;

public class Square extends Shape{
	public int side;
	
	public Square(int side ) {
		this.side = side; 
	}
	@Override
	public
	void draw() {
		System.out.println("square drawn");
	}
	@Override
	public
	double calculateArea() {
		return this.side*this.side;
	}
}
