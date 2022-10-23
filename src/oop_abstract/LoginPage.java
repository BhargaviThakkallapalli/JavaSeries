package oop_abstract;

public class LoginPage extends Page{

	public LoginPage() 
	{
		System.out.println("LP --- default ...const");
	}
	public LoginPage(int i)
	{
		super(10);
		System.out.println("LoginPage...const..." +i);
	}
	
	@Override
	public void title() {
		System.out.println("Login Page Title");
	}

	@Override
	public void url() {
		System.out.println("Login Page url");		
	}

	public void resetPwd() {
		System.out.println("Login Page --- reset Pwd");		

	}
	public void doLogin(String un, String Pwd) {
		System.out.println("LoginPage:" +un+":"+Pwd);
	}
	
	
}
