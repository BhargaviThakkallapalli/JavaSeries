package JavaSessions;

public class Customer {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		// 4 classes and interchange
		Customer c1 = new Customer();
		c1.name = "Mahi";
		c1.age = 0;
		c1.city = "Australia";
		
		Customer c2 = new Customer();
		c2.name = "Vamshi";
		c2.age = 38;
		c2.city = "India";
		
		Customer c3 = new Customer();
	    c3.name = "Jasmi";
		c3.age = 8;
		c3.city = "Hyderabad";
		
		Customer c4 = new Customer();
	    c4.name = "Josh";
		c4.age = 32;
		c4.city = "Kannur";
		
		System.out.println(c1.name +" "+c1.age+" "+c1.city);
		System.out.println(c2.name +" "+c2.age+" "+c2.city);
		System.out.println(c3.name +" "+c3.age+" "+c3.city);
		System.out.println(c4.name +" "+c4.age+" "+c4.city);
		System.out.println("--------");
		
		c1=c2;
		System.out.println(c1.name +" "+c1.age+" "+c1.city);
		System.out.println(c2.name +" "+c2.age+" "+c2.city);
		System.out.println(c3.name +" "+c3.age+" "+c3.city);
		System.out.println(c4.name +" "+c4.age+" "+c4.city);
		System.out.println("--------");
		
		c2=c3;
		System.out.println(c1.name +" "+c1.age+" "+c1.city);
		System.out.println(c2.name +" "+c2.age+" "+c2.city);
		System.out.println(c3.name +" "+c3.age+" "+c3.city);
		System.out.println(c4.name +" "+c4.age+" "+c4.city);
		System.out.println("--------");
		
		c3=c4;
		System.out.println(c1.name +" "+c1.age+" "+c1.city);
		System.out.println(c2.name +" "+c2.age+" "+c2.city);
		System.out.println(c3.name +" "+c3.age+" "+c3.city);
		System.out.println(c4.name +" "+c4.age+" "+c4.city);
		System.out.println("--------");
		
		c4=c1;
		System.out.println(c1.name +" "+c1.age+" "+c1.city);
		System.out.println(c2.name +" "+c2.age+" "+c2.city);
		System.out.println(c3.name +" "+c3.age+" "+c3.city);
		System.out.println(c4.name +" "+c4.age+" "+c4.city);
		

	}

}
