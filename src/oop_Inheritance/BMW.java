package oop_Inheritance;

public class BMW extends Car
{

	//Method Overriding: Poly+ Morphism (RunTime/Dynamic)
	//when you have a method in parent class and the same method is in child class:
	//1. with the same method name
	//2. same number of parameters
	//3. same return type
	
	
	@Override
	 public void start()
	 {
		System.out.println("BMW -- start"); 
	 }
	public void stop() {
		  System.out.println("BMW---stop");
	  }
	 public void autoParking()
	 {
		System.out.println("BMW -- autoParking"); 
	 }
	
	 
	 //Method hiding: is only applicable for static variables
	 public static void billing() {
		 System.out.println("BMW --- billing");
	 }
	 
}
