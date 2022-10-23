package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		// = means assigning the value
		//== compare the value
		int i =10;
		int j = 20;
		if(i==j)
		{
			System.out.println("both are equal");
			
         }
		else {
			System.out.println("both are not equal");
			
		}
		
		//> < >= <= ==
		
     if (10==20)
     { //Dead Code
	  System.out.println("hello");
     }
     else {
    	 System.out.println("world");
     }
     
	if(true)
	{
    System.out.println("print");
	
	}
	else {//Dead code
		System.out.println("hello");
	}
 
	boolean flag = false;
	if(flag) {	
	System.out.println("Testing with selenium");
	}
	else {
		System.out.println("Testing with cypress");
	}
	
	// nested if
	int total = 120;
	if(total <= 100)
	{
		System.out.println("PASS");
		 if(total >= 90)
		   {
		     System.out.println("A Grade");
		   
		       if(total >= 95)
		       { 
		    	   System.out.println("100% discount...");
		       }
		       else
		       {
		    	   System.out.println("70% discount...");
	           } 
		   }
		   else
			   {
			    	System.out.println("B Grade");
			   
			   }
       }
	
	else {
		System.out.println("Invalid Marks");
		
	}
	
	//take a browser value ....ch/ff/ie/safari...
	//if the condition is matched...launch the browser
	//else print a msg: please pass the right browser
	
	String browser = "chrome";
	if(browser.equals("chrome"))
	{
	System.out.println("launch the chrome....");
	}
	if(browser.equals("firefox")) {
		System.out.println("launch the firefox...");
	}
	if(browser.equals("ie")) {
		System.out.println("launch the ie...");
	}
	if(browser.equals("safari")) {
		System.out.println("launch the safari...");
	}
	else {
		System.out.println("please pass the right browser..." +browser);
	}
	
	
	//if-else if:
	//take a browser value ....ch/ff/ie/safari...
	//if the condition is matched...launch the browser
	//else print a msg: please pass the right browser
	
	String browserName = "chrome";
	if(browserName.equals("chrome"))
	{
	System.out.println("launch the chrome....");
	}
	else if(browserName.equals("firefox")) {
		System.out.println("launch the firefox...");
	}
	else if(browserName.equals("ie")) {
		System.out.println("launch the ie...");
	}
	else if(browserName.equals("safari")) {
		System.out.println("launch the safari...");
	}
	else {
		System.out.println("please pass the right browser..." +browserName);
	}

	
	
	 
   }
	
}
