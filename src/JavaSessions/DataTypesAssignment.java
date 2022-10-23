package JavaSessions;

public class DataTypesAssignment {

	public static void main(String[] args) {
		// 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
//		Expected Output :
//			Hello 
//			Naveen K
          System.out.println("Hello");
          System.out.println("Bhargavi T");
//          2. Write a Java program to print the sum of two numbers.
//          Test Data:
//           74 + 36
//          Expected Output:
//          110     
        int a = 74;
        int b = 36;
        System.out.println(a+b);
//3. Write a Java program to divide two numbers and print on the screen.
//        Test Data:
//        50/3
//        Expected 
//        Expected Output :
//        43 
//        1 
//        19 
//        13 
        int c = 50;
        int d = 3;
        System.out.println(c/d);
        		
//5. Write a Java program to compute the specified expressions and print the output. Go to the editor
//        Test Data:
//        ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//        Expected Output
//        2.138888888888889
          System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
   
//6. Try to concat "Hello Selenium" with a character 't'. 
        System.out.println("Hello Selenium " + 't');
        
// 7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
//        "Your Total amount is. 3700".
        int e = 100;
        int f = 200;
        int g = 3400;
        int h = e+f+g;
        System.out.println("Your Total amount is. "+h);
// 8. What should be the output for :
//        	byte b3 = 065; 
//        	System.out.println(b3);  
        byte b3 = 065;
        System.out.println(b3); // 53
        
        
	}

}
