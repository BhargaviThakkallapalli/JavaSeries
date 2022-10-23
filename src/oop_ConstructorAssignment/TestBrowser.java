package oop_ConstructorAssignment;

public class TestBrowser {

	public static void main(String[] args) {
		
		Browser b = new Browser("MAHANSH", 0.5, "Course");
		
		System.out.println(b.getVersion());
		System.out.println(b.getName());
		System.out.println(b.getPlugin());
		
		b.setName("Vamshi");
		b.setPlugin("dr");
		b.setVersion(38);
		
		System.out.println(b.getVersion());
		System.out.println(b.getName());
		System.out.println(b.getPlugin());
		
		
		
	}

}
