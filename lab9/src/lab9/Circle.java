package lab9;

public class Circle {
	private double radius=5.0;
	private String color="Green";
	
	
	//constructors
	public Circle() {};
	
	public Circle(double radius) {
		this.radius=radius;
		
	}
	public Circle(double radius,String color) {
		this.radius=radius;
		this.color=color;
	}
	
	//getters and setters
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea(double radius) {
		return radius*radius*Math.PI;
		
	}
	

}
