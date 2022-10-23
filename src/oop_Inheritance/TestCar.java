package oop_Inheritance;

public class TestCar {

	public static void main(String[] args) 
	{
		BMW b = new BMW();
		b.start(); //Overridden method
	    b.stop(); // Inheritance
		b.refuel(); //inherited
		b.autoParking(); //individual
		b.engine();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		Vehicle v = new Vehicle();
		v.engine();
		
		//child class object can be referred by parent class ref variable
		//top casting: only parent classes can be accessed.
		//individual methods cannot be accessible in top casting
		// every BMW is a car
		Car c1 = new BMW(); //BMW start
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();
		
		Vehicle v1 = new BMW();
		v1.engine();
		
		Vehicle v2 = new Car();
		v2.engine();
		
		
		//Down casting: No use case
		//parent class object can be referred by child class ref variable 
		//every car is not a BMW
		// BMW b1 = (BMW)new Car(); //ClassCastException 
		// it is not used any where in frame
		
		
		
	}
	
			

}
