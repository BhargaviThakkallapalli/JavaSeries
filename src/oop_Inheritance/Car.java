package oop_Inheritance;

public class Car extends Vehicle {

	 //Method Overriding: Poly + Morphism (RunTime/Dynamic)
	//final:
	//to prevent method overriding --- method final
	// to prevent inheritance --- class final
	//to provide the constant data
	
	// private cannot be overridden 
	
	
	  public void start() {
		  System.out.println("car---start");
	  }
	  public void stop() {
		  System.out.println("car---stop");
	  }
	  public void refuel() {
		  System.out.println("car---refuel");
	  }
	  public static void billing() {
			 System.out.println("car --- billing");
		 }
	
}
