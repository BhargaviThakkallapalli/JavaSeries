package OOP_MultipleInheritance;

public class LoginPage extends Page {

	@Override
	public void getColor()
	{
		System.out.println("LoginPage -- Orange color");
	}
	
	public void doLogin()
	{
		System.out.println("LoginPage -- do Login");
	}
	
}
