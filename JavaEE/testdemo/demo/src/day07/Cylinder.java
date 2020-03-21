package day07;

public class Cylinder extends Circle{
	double length;
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public Cylinder() {
		this.length = 1;
	}
	public double findVolume() {
		double area = super.findArea();
		return area*this.length;
	}
	
	@Override
	public double findArea() {
		return 2*3.14*this.radius*this.length;
	}
	
	public static void main(String[] args) {
		Cylinder c = new Cylinder();
		c.setLength(3);
		c.setRadius(4);
		System.out.println(c.findVolume());
		System.out.println(c.findArea());
	}
}
