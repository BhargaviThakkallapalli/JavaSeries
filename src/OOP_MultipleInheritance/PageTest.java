package OOP_MultipleInheritance;

public class PageTest {

	public static void main(String[] args) {
		
		Page p = new Page();
		p.getColor();
		p.getPageLoadTimeOut();
		
		LoginPage lp = new LoginPage();
		lp.doLogin();
		lp.getColor();
		lp.getPageLoadTimeOut();
		
		
		CartPage cp = new CartPage();
		cp.addToCart();
		cp.getColor();
		cp.getPageLoadTimeOut();
		
	}

}
