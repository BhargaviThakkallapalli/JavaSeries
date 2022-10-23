package ExceptionHandling;

public class ThrowsKeyword {
	
	
	public static void addToCart() throws ArithmeticException{
		System.out.println("adding to cart");
		doPayment();
	
	}
	
	public static void generateOrderId() {
		System.out.println("generate Order ID");
		int i =9/0;
		
	}
	public static void doPayment() 
	{
	System.out.println("doPayment");
	
	try {
	generateOrderId();
	}
	catch(ArithmeticException e) {
		System.out.println("AE is coming....");
		e.printStackTrace();
	}
	}
	public static void main(String[] args) {
		
		addToCart();
		
		System.out.println(" bye");
	
	
	}

}
