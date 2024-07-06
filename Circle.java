package ostad_assignment_2;

public class Circle extends Shape {
	public int r;
	public Circle(int r) {
		this.r= r;
	}
	@Override
	public void draw() {
		System.out.println("circle drawn");
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*this.r*this.r;
	}
}
