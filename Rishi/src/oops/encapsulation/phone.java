package oops.encapsulation;

class Vehicle{
	
	void go(){
		System.out.println("This vehicle is moving");
	}
	
	void stop(){
		System.out.println("This vehicle has stopped");
	}	
	
}

class phone extends Vehicle{
	
	int wheels = 4;	
	String name = "Honda";

}

class Cycle extends Vehicle{
	
	int pedals = 2;	
	String name = "Firefox";		
	
}

public class phone{
	
	public static void main(String[] args) {
		
		Car car = new Car();
		Cycle bike = new Cycle();

		car.go();
		bike.stop();
		
		System.out.println("Car has "+car.wheels+" wheels.");
		System.out.println("Bike has "+bike.pedals+" pedals.");

	}
	
}