package JavaSessions;

public class CarType {
	
	String name;
	int price;
	String plateNumber;
	static int wheels = 4;
	
	static String compName = "Amazon";
	int age;
	//properties having the same name and common values should be defined with static key word
	//template variables should not have same values. 
	//Common memory allocation (CMA) or called permanent generation --> Metaspace
	//static properties will be stored in meta space
	
	public void sendMail() {
		System.out.println("Send mail");
	}
	public static void getInfo() {
		System.out.println("get info");
	}
	
	
	public static void main(String[] args) {
		CarType c1 = new CarType();
		c1.name = "BMW";
		c1.price = 75;
		c1.plateNumber = "TS071253";
		
		CarType c2 = new CarType();
		c2.name = "YAMAHA";
		c2.price = 60;
		c2.plateNumber = "2B6SF";
		
		CarType c3 = new CarType();
		c3.name = "Audi";
		c3.price = 65;
		c3.plateNumber = "VIC020";
		
		//how to access static variables:
		//1.use the class name:
		System.out.println(CarType.wheels);
		
		//2.direct access:
		System.out.println(wheels);
		
		//3. can i static variables using object reference --- Not recommended -- warning
		System.out.println(c1.wheels);
		
		
		CarType c = new CarType();
		c.name = "Mahi";
		c.age = 0;
		
		System.out.println(c.name +" "+c.age+" "+CarType.compName);
		System.out.println(compName);
		
		//how to access static methods:
		//1. using class name:
		CarType.getInfo();
		//2. calling directly:
		getInfo();
		//3. using object ref?
		c.getInfo();
		
		
		//how to access non static vars and methods: we have to create the object
		c.sendMail();
		
	}

}
