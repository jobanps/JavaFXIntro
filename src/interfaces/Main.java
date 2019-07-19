package interfaces;

public class Main {

	public static void main(String[] args) {
		Square sq1 = new Square("Red", 5);
		Square sq2 = new Square("Green", 5);
		
		sq1.sayHello();
		sq1.calcArea();
		sq2.sayHello();
		sq2.calcArea();
	}
	
}
