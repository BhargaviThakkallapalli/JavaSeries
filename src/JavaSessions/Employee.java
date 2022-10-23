package JavaSessions;

public class Employee {
	// we can have data members in every class
	// data members: class variables and methods
	// We cannot create a method inside a method
	// methods are always independent and parallel to each other
    
	
	//1. no input and no return:
	//void -- does not return anything 
	public void test() {
		System.out.println("test method");
	}
	
	//2. some input and some return:
	public String getName() {
		System.out.println("get name method");
		String n = "Mahi";
		return n;
	}
	
	public int add() {
		System.out.println("add numbers");
		int a = 100;
		int b = 200;
		int c = a+b;
		return c;
	}
	//3. some input some return:
	public int sum(int x, int y) // x , y are input parameters 
	{
		System.out.println("sum method");
		int total = x+y;
		return total;
	}
	
	//WAF: getMarks---> input parameter: studentName
	//return the student marks
	//if studentName not found return something
	public int getMarks(String studentName)
	{
		System.out.println("getting student marks for : " +studentName);
		if(studentName.equals("Jasmi"))
		{
			return 90;
		}
		else if(studentName.equals("Mahi"))
		{
			return 95;
		}
		else if(studentName.equals("Vamshi"))
		{
			return 95;
		}
		else
		{
			System.out.println("student name is is not found..." + studentName);
		    return -1;
		}
		
	}
	
	// other approach
	public int getMarksOf(String studentName)
	{
		System.out.println("getting student marks for : " +studentName);
		int marks = 0;
		if(studentName.equals("Jasmi"))
		{
			marks = 90;
			//return 90;
		}
		else if(studentName.equals("Mahi"))
		{
			marks = 95;
			//return 95;
		}
		else if(studentName.equals("Vamshi"))
		{
			marks = 95;
			//return 95;
		}
		else
		{
			System.out.println("student name is is not found..." + studentName);
		    //return -1;
		}
		return marks;
	}
	
	
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.test();
		String name = e.getName();
		System.out.println(name + 100);
		int s = e.add();
		System.out.println(s + 100);
		
		int sum = e.sum(10, 20); // 10, 20 are method arguments
		System.out.println(sum);
		
		int m = e.getMarks("Vamshi");
		System.out.println(m);
		
		int n = e.getMarks("Bhargavi");
		System.out.println(n);
		
	}

}
