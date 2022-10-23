package JavaSessions;

public class EmployeeType {
	
	String name;
	int age;
	double salary;
	
	//constructor of the class:
	//const.. name is same as the class name
	//const.. cannot return anything but function may or may not return
    //const.. no void keyword
	//const... will be called when you create the object but function will be called with object ref name
	public void test() {
		System.out.println("test method...");
	}
	
	//const.. overloading
	
	public  EmployeeType() 
	{
		System.out.println("default param...");
	}
	public  EmployeeType(int a) 
	{
		System.out.println("one param..."+a);
	}
	public  EmployeeType(int a, String b) 
	{
		System.out.println("two params..." + a+b);
	}
	
	
	public static void main(String[] args) {
	
		EmployeeType e1 = new EmployeeType();
		e1.test();
		EmployeeType e2 = new EmployeeType(10);
		e2.test();
		EmployeeType e3 = new EmployeeType(10,"Mahi");
		e3.test();
		
		
		
		
		
	}

}
