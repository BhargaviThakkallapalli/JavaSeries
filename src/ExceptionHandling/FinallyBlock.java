package ExceptionHandling;

public class FinallyBlock {
	
	public int getMarks(String stName) {
		System.out.println("getting marks for : " +stName);
		
		if(stName.equals("Mahi"))
		{
			try{
				int i = 9/0;
				//System.exit(1);//shutdown JVM
				return 85;
			}catch(ArithmeticException e ) {
				System.out.println("AE is coming...");
				return 50;
			}
			finally {
				System.out.println("im in finally block");
				//return 10;
			}
			//return 100;
		}
		else if (stName.equals("jasmi")){
			return 90;
		}
		
		else if (stName.equals("Joshi")){
			return 95;
		}
		else {
			System.out.println("st name is not found...");
			return -1;
		}
	}

	public static void main(String[] args) {

		
		System.out.println("A");
		try {
			int i = 9/0;
			
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("AE is coming...");
		}
		
		finally {
			System.out.println("im in finally block");
		}
		
		
		//use cases:
		//create a DB connection: un/pwd --- PASS
		//hit a SQL  query -- PASS
//		try {
//		//get the results -- FAIL -- Exception 
//		}
//		catch() {
//			SQLEXCEPTION
//		}
//		//store the results
		//print the results
		
		//use cases:
				//create a DB connection: un/pwd --- PASS
				//hit a SQL  query -- PASS
//				try {
//				//get the results -- FAIL -- Exception 
//				}
//				catch() {
//					SQLEXCEPTION
//				}
//				//store the results
				//print the results
				
		
	}

}
