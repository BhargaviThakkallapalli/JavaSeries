package JavaSessions;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("hi...");
		MainMethodOverloading.main();
		MainMethodOverloading.main(10);
		
	}
	
	public static void main() {
		System.out.println("bye...");	
	}
	
	public static void main(int i) {
		System.out.println("pop..." +i);	
	}
	
	
}
