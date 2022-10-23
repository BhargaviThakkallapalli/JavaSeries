package StringManipulation;

public class StringTest {

	public static void main(String[] args) {
		
		String x = "hello selenium "; //String literals ---> SCP
		String y = x.concat("testing");
		System.out.println(x); // hello selenium
		System.out.println(y); //hello selenium testing
		
		//
		String t1 = "java";
		String t2 = "java";
		String t3 = "Java";
		
		
		String t4 = new String("selenium");//2 objects -- heap + SCP
		String t5 = "selenium";
		String t6 = "selenium";
		t5 = "ruby";
		
		System.out.println(t5);
		
		String t7 = new String("selenium"); //heap(1)+SCP(0)
		
		String t8 = "selenium";
		
		String t9 = new String("automation");
		
		String t10 = "automation";
		
		System.out.println(t10+"naveen"); //automationnaveen
		
		
	}

}
