package JavaSessions;

public class ForEachLoop {

	public static void main(String[] args) {
		
		// for each loop only work for incremental 
		// it will not decrement the loop
		int i[] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		//1. index based for loop:
		for(int j = 0; j<i.length; j++)
		{
			System.out.println(i[j]);
		}
		
System.out.println("------");
 
     //2. for each:
   for(int e:i)
   {
	   System.out.println(e);
   }

   //2. double:
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 24.44;
		d[2] = 24.02;
		for (double f : d)
		{
			System.out.println(f);	
		}
		
//3. char
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '$';
		c[2] = 'b';	
			
		for(char e :c)
		{
			System.out.println(e);
		}
		
		
		
		
		
		
		
	}

}
