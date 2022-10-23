package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {
		
		String str = "Hi this is my Java code";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		
		System.out.println(str.charAt(22));
		
		System.out.println(str.length()-1);
		
		//System.out.println(str.charAt(23)); SIOB
		//System.out.println(str.length()-1); SIOB
		//System.out.println(str.charAt(-1)); SIOB
		
		System.out.println(str.indexOf('H'));

		System.out.println(str.indexOf('i')); //1 -- 1st occurrence of i
		
		System.out.println(str.indexOf('i', 2));//2 nd occurance of i
		
		System.out.println(str.indexOf('i', str.indexOf('i')+1));

		
		String mesg = "admin welcome";
		if(mesg.indexOf("admin")>=0)
		{
			System.out.println("correct");
		}
		else {
			System.out.println("incorrect");
		}
		
		
		String s = "    hello     world      ";
		System.out.println(s.trim());
		
		String data = " name is admin    ";
		String browser = "chrome ";
		if(browser.trim().equals("chrome")) {
			
		}
		
		String t ="hello    world";
		System.out.println(t.replace(" ", ""));
		
		
		String dob = "01-01-1990";
		System.out.println(dob.replace("-", "/"));
		
		String h = "Hi this is my Java code and i am so happy";
		System.out.println(h.toUpperCase());
		System.out.println(h.toLowerCase());
		
	
		//String comp:
		String m1 = "chrome";
		String m2 = "Chrome";
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equalsIgnoreCase(m2));
		
		String main = "welcome to testing world";
		System.out.println(main.contains("testing"));
		System.out.println(main.contains("Java"));

		System.out.println(main.replace("\\s+", ""));
		
	}

}
