package JavaSessions;

public class Car {
	//vars: these variables are called instance variables or class variable
	
	String name;
	int price;
	String color;
	boolean isAutomatic;
	
	public static void main(String[] args) {
		
		//create the object of the class using new keyword;
		//c1 is the object reference name
		//object will decide a name
		
		Car c1= new Car(); // 
		
		c1.name = "BMW";
		c1.price = 40;
		c1.color = "white";
		c1.isAutomatic = true;
		
		System.out.println(c1.name +" "+c1.price+" "+c1.color+" "+c1.isAutomatic);
		
		Car c2= new Car(); // 
		c2.name = "Audi";
		c2.price = 30;
		c2.color = "Black";
		c2.isAutomatic = true;
		
		System.out.println(c2.name);
		System.out.println(c2.price);
		System.out.println(c2.color);
		System.out.println(c2.isAutomatic);
		
		//no reference object, it will create unnecessary object
	    // new Car(); 
		
		System.gc(); // garbage collector for heap memory
		// to call garbage collector manually
		
		
		Car t1 = new Car();
		t1 = null; // it is null
//		t1.name = "BMW 5"; //NullPointerException (NPE)
//		System.out.println(t1.name);
//	
		
		
	}

}
