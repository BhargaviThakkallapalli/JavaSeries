package JavaSessions;

public class ArithMeticConcepts {

	public static void main(String[] args) {
	
		System.out.println(10/2);
		System.out.println(9/2); //4 if both are integers then integer value printed in the output
		System.out.println(9/2.0); //4.5
		System.out.println(9.0/2); //4.5 either of them should be floating value
		System.out.println(8/3);
		System.out.println(9.0/2.0);
		
		// System.out.println(9/0); //Arithmetic exception /by zero
		
		System.out.println(9.0/0); //Infinity
		
		//exception is kind of error, if we got exception program will be terminated
		//arithmetic exception is designed for pure integer
		System.out.println(0/9); //0
		
		System.out.println(9/0.0); //Infinity
		//System.out.println(0/0); ////Arithmetic exception
		
		System.out.println(0.0/0); //NaN
		System.out.println(0.0/0.0); //NaN
		System.out.println(0/0.0); //NaN
		
		System.out.println(9/9); //1
		System.out.println(100.2/0); //Infinity
		//System.out.println(100/0); //AE
		
		System.out.println(9 % 3); //Modulus operator give reminder
		System.out.println(9 % 2); // 1 -- o/p
		
		System.out.println(11%2);
		System.out.println(17 % 3);
		
		System.out.println(100/2 +"hello");
		
		String c = "hello";
		String d = "world";
		System.out.println(c+" "+d);
		
		
		
	}

}
