package Abstraction_program;

public class Car implements Vechicle {
@Override
public void start() {
	System.out.println("Car Started");
}
	@Override
	public void stop() {
		System.out.println("Car Stopped");
	}
}
