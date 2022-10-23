package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// 1 to 10:
		
		//1. While Loop
		
		int i = 1;
		while(i<=10)
		{
			System.out.println(i);
			 i++;
			// ++i;
			//i = i+1; // any of 3 increment operator we can use.
		}
		
		// 0 to 10 even 0 2 4 6 8 10
	
		int e = 0;
		while(e<=10)
		{
			System.out.println(e);
			e = e+2;
		}
		int o = 1;
		while(o<=10)
		{
			System.out.println(o);
			o = o+2;
		}
		//1 to 100:
		//every multiplication of 5--> print hi...
		int k = 1;
		while(k<=100)
		{
			System.out.println(k);
			     if(k%5 ==0) {
			    	 System.out.println("hi...");
			    	
			     } 
			     if(k==50) {
			    	 System.out.println("half century...");
			     }
			     k++;
		}
		
		
		//use cases for "while" loop:
		// Thumb rule of while loop 
		//when number of iterations are not fixed.
		//page loading time
		//number of web elements on the page --- 10, 20, 40, 5
		//web table - pagination --> 1 2 3 4 5 6 7... next
		
		
		//use cases for "for" loop:
		//when number of iterations are fixed.
		//5 elements -- fixed
		
		
		//2. for loop:
		//1 to 10:
		for (int t =1; t<=10; t++)
		{
			System.out.println(t);
		}
//		for(;;) {
//			System.out.println("bye");
//		}
		
		//do-while:
		//1 to 10:
		//1 2 3 4 5 .... 10
		//use-cases: web table pagination
		int m=1;
		do {
			System.out.println((m));
			m++;
		} while (m<=10);
		
		
		
		
		
	}

}
