package publisherSubscriber;

import java.util.Observable;
import java.util.Observer;

public class Person implements Observer {
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hey, I am " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
		System.out.println(name + " received new Message from Publisher");
		System.out.println("Weather Updated to " + arg.toString());
		
		
	}

}
