package interfaces;

public class Square implements Shape {

	private String color;
	private double side;
	
	public Square(String color, double side) {
	this.color = color;
	this.side = side;
	}
	
	public void sayHello() {
		System.out.println("Hey, I m " + color + " Square");
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public void calcArea() {
		
		System.out.println("My Area with side " + side + " is " + (side * side));
		
	}

}
