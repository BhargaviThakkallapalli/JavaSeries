package oop_Interface;

public interface USMedical {

	int min_fee = 10;
	//Interface variables are static and final by default
	//abstract method: having no method body: method prototype/ only method declaration
	// we cannot create the object for Interface.
	//100% abstraction 
	// these are by default abstract in nature,  we can even have abstract keyword 
	 public void pediaServies();
	 
	 public void physioServices();
	
	 public void orthoServices();
	 
	 public void emergencyServices();
		
	 public void dentalServices();
	 
	 public void dentalServices(int dentists);
	 
	 public void dentalServices(int dentists, String dentalMachine);
		
	 
	 //after JDK 1.8
	 
	 //two major changes:
	 
	 //1. can have a static method with method body
	 
	 public static void medicalTraining() {
		 System.out.println("US Medical training");
	 }
	 
	 //2. can have a default method
	 
	 default void donation(){
		 System.out.println("US medical donation");
	 }
	 
	 
	 
	 
	 
}
