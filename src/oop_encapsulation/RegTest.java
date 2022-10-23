package oop_encapsulation;

public class RegTest {

	public static void main(String[] args) {
		
		//reg page:
		Registration reg = new Registration("Mahi", "Mahi@gmail.com");
		
		//go to profile page:
		System.out.println(reg.getFirstName()+ " " + reg.getEmailAddress());
		
		System.out.println(reg.getFirstName()+" "+reg.getPassword()+" "+reg.getEmailAddress());
		
		//
		reg.setLastName("Surabhi");
		reg.setPhoneNumber("9949414873");
		reg.setPassword("Mahi@2402");
		
		System.out.println(reg.getFirstName()+" "+reg.getPassword()+" "+reg.getEmailAddress());
		
		
	}
	LoginPage adminUser = new LoginPage("admin", "admin123");
	
	{
		adminUser.doLogin();
	}
}

