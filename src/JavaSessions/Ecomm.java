package JavaSessions;

public class Ecomm {
	// method overloading: compile time poly(many)+ morphism(forms)
	// within the same class, when you have methods with:
	// 1. every method should have same name
	// 2. different number of parameter
	// 3. different sequence of the parameters
	// method overloading is user friendly. systematically designed
//feature 
	public void test() {// 0 param

	}

	public int test(int i) {// 1 param
		return 10 + i;
	}

	public void test(String k) {// 1 param

	}

	public void test(int p, String k) {// 2 param

	}

	public void test(String k, int p) {// 2 param

	}

	// method overloading login page
	public void login() {

	}

	public void login(String username, String password) {

	}

	public void login(String username, String password, int otp) {

	}

	public void login(String username, String password, int otp, String role) {

	}

	// method overloading search page

	public void search() {

	}

	public void search(String productName) {

	}

	public void search(String productName, String color) {

	}

	public void search(String productName, String color, int price) {

	}

	// method overloading doPayment page
	public void doPayment(String upi) {

	}

	public void doPayment(String CC, int cvv, int otp) {

	}

	public void doPayment(String paypalId, String pwd) {

	}

	// uber:
	public void booking(String stLocation, String endLocation) {

	}

	public void booking(String stLocation, String endLocation, String carType) {

	}

	public void booking(String stLocation, String endLocation, String carType, String couponCode) {

	}

	public static void main(String[] args) {

		Ecomm obj = new Ecomm();
		obj.test();
		int sum = obj.test(20);
		System.out.println(sum);

	}

}
