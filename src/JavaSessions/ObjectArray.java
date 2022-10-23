package JavaSessions;

public class ObjectArray {

	public static void main(String[] args) {
		// Object is a class
		//Object Array is a static array
		// it is only used when we are aware of the data
		
		Object emp[] = new Object[5];
		emp[0] = "Mahansh";
		emp[1] = 0.45;
		emp[2] = 'm';
		emp[3] = 24.02;
		emp[4] = true;
		
	System.out.println(emp[0]);
	// System.out.println(emp[5]);//AIOB
	
	
	for(int i = 0; i<emp.length; i++)
	{
		System.out.println(emp[i]);
	}
				
	System.out.println("------");
	 
    //2. for each:
  for(Object Mahansh :emp)
  {
	   System.out.println(Mahansh);
	   if(Mahansh.equals("Mahansh")) {
		   System.out.println("hi...");
		   break;
	   }
  }

			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
