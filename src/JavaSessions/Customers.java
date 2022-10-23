package JavaSessions;

public class Customers {
	
	String name;
	int age;
	String city;
	String phone;
	
	//create customers with different combinations:
	//no default values types of customer
	//method: business logic can be defined in method --feature
	//const.. never define business logic
	
	public Customers(String name) {
		this.name = name;
	}

	public Customers(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Customers(String name, int age, String city, String phone) {
		this.name = name;
		this.age = age;
		this.city = city;
		this.phone = phone;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
