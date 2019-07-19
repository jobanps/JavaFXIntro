package publisherSubscriber;

import java.util.Observable;


public class Weather extends Observable {

	private double temp;
	
	public double getTemp() {
		return temp;
	}

	public Weather(double temp ) {
		this.temp = temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
		
		this.setChanged();
		
		this.notifyObservers(this.temp);

	}

	public void sayHello() {
		System.out.println("Weather is " + temp);
	}


}
