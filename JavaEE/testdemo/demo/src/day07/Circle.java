package day07;

public class Circle {
	double radius;
	
	public Circle() {
		this.radius = 1;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		return 3.14*this.radius*this.radius;
	}
}