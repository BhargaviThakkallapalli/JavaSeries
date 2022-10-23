package JavaSessions;

public class ConditionalOperatorAssignment {

	public static void main(String[] args) {
		// Conditional Operators:

//
//Find out the greatest number out of three different given numbers:
//Input the 1st number: 25 
//Input the 2nd number: 78 
//Input the 3rd number: 87
//Expected Output 
//The greatest: 87
		int a = 25;
		int b = 78;
		int c = 87;
		if (a>b && a>c) {
			System.out.println("The greatest: " +a);
				
		}
		else if (b>c)
		{
			System.out.println("The greatest: " +b);
		}
		else
		{
			System.out.println("The greatest: " +c);
		}
		System.out.println("Input the 1st number:" +a);
		System.out.println("Input the 2nd number:" +b);
		System.out.println("Input the 3rd number:" +c);
		System.out.println("The greatest: ");
		
//		2. Write a Java program to test a number is positive or negative.
//		Test Data
//		Input number: 35 -- positive number
//		Input number: -11 -- negative number
		int d = 35;
		int e = -11;
		if (d>=0)
		{
			System.out.println("positive number");
		}
		else
		{
			System.out.println("negative number");
		}
		if (e<0)
		{
			System.out.println("negative number");
		}
		else
		{
			System.out.println("positive number");
		}
		
		
	}

}
