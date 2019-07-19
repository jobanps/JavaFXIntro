package publisherSubscriber;

public class Main {

	public static void main(String[] args) {
		Weather w = new Weather(25.4);
		w.sayHello();


		Person p = new Person("Jobanpreet Singh");
		p.sayHello();

		w.addObserver(p);
		w.setTemp(30);
	}
}
