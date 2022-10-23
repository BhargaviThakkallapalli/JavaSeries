package JavaSessions;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		//ArrayLiterals: Static array
		
		int i[] = {10, 20, 30, 40};
		
		System.out.println(i.length);
		System.out.println("hi = "+ (i.length-1));
		System.out.println("li = "+ 0);
		System.out.println(i[0]);
		
		//System.out.println(i[4]);//AIOB
		
		for(int e: i)
		{
			System.out.println(e);
		}
		
	//String array Literals
		String students [] = {"Ramya","Ravi", "Mahansh", "Vamshi"};
		System.out.println(students.length);
		
		for(String m: students)
		{
			System.out.println(m);
			if(m.equals("Mahansh"))
			{
				System.out.println("Hello...");
			}
			if(m.equals("Vamshi"))
			{
				System.out.println("100 Marks...");
				break;
			}
		}
		
		//Object Array Literals:
		Object empData[] = {"Mahi", 0.45, 25, true, 'm'};
		
		for(Object e : empData)
		{
			System.out.println(e);
		}
	}

}
