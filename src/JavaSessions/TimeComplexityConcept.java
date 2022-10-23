package JavaSessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {
		
		//optimal time to run algorithm
		// It should be defined in the form of BIG O
		//BIG O - TC
		// how much time it will take to execute the program 
		
		int i = 1;
		//O(1)
		
		int p = 2;
		int total = i+p;
		System.out.println(total);
		
		//O(N) --> N = 1 ---> O(1) --- constant time...
		
		for(int k = 1; k<=100000; k++)
		{
			System.out.println(k);
		}
		
		//1+n+n+n ==> 1+3n ==> 3n+1 --- linear equation
		//3n + 1 ==> 3n --> O(n)
		
		for(int k =1; k<=10; k++)
		  System.out.println(k);
		  System.out.println("hi");
		  System.out.println("bye");
		  
		  //1+ n+n+n+n+n ==> 1+5n ==> 5n+1 --- linear equation
		  //5n+1 ==> 5n ---> O(n)
		  
		
		  for(int k = 1; k<=100000; k++)
			{
				System.out.println(k);
			}
		  for(int k = 1; k<=100000; k++)
			{
				System.out.println(k);
			}
		  for(int k = 1; k<=100000; k++)
			{
				System.out.println(k);
			}
		
		
		
		
		
	}

}
