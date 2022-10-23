package JavaSessions;

public class User {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		//
		
		User u1 = new User();
		u1.name = "Mahi";
		u1.age = 0;
		u1.city = "Australia";
		
        User u2 = new User();
		u2.name = "Vamshi";
		u2.age = 38;
		u2.city = "India";
		
        User u3 = new User();
	    u3.name = "Jasmi";
		u3.age = 8;
		u3.city = "Hyderabad";
		
		System.out.println(u1.name +" "+u1.age+" "+u1.city);
		System.out.println(u2.name +" "+u2.age+" "+u2.city);
		System.out.println(u3.name +" "+u3.age+" "+u3.city);
				
		u1 = u2; //
		System.out.println(u1.name +" "+u1.age+" "+u1.city);
		System.out.println(u2.name +" "+u2.age+" "+u2.city);
		System.out.println(u3.name +" "+u3.age+" "+u3.city);
		
		u2 = u3;
		System.out.println(u1.name +" "+u1.age+" "+u1.city);
		System.out.println(u2.name +" "+u2.age+" "+u2.city);
		System.out.println(u3.name +" "+u3.age+" "+u3.city);
		
		u3 =u1;
		System.out.println(u1.name +" "+u1.age+" "+u1.city);
		System.out.println(u2.name +" "+u2.age+" "+u2.city);
		System.out.println(u3.name +" "+u3.age+" "+u3.city);
		
		
		
		
		
		
	}

}
