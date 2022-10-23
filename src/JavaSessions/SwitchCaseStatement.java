package JavaSessions;

public class SwitchCaseStatement {

	public static void main(String[] args) {
	//take a browser value ....ch/ff/ie/safari...
		//if the condition is matched...launch the browser
		//else print a msg: please pass the right browser
		
		String browser = "safari";
		
		switch(browser) {
		
		case "chrome":
			System.out.println("launch the chrome...");
		
		break;
		case "firefox":
			System.out.println("launch the firefox...");
		break;
		case "ie":
			System.out.println("launch the ie...");
		break;
		case "safari":
			System.out.println("launch the safari...");
		break;
			default:
				System.out.println("please pass the right browser..." +browser);
			
		}
		//switch case: byte, short, int, long, double, float, char, String
		
		char b = 'a';
		
switch (b) {
case 10:
	
	break;

default:
	break;
}

	}

}
