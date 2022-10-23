package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {

		Ecomm e = new Ecomm();
		e.doLogin("bhargathakkallapalli@gmail.com", "bhargavi123")
			.search("mackbook")
				.addtoCart("mackbook pro")
					.makePayment("1212 1212 1212 2402", 240)
						.generateOrder()
							.logout();

		e.doLogin("bhargathakkallapalli@gmail.com", "bhargavi123")
			.addtoCart("mackbook pro")
				.makePayment("1212 1212 1212 2402", 240)
					.generateOrder()
						.logout();

		e.doLogin("surabhiv9@gmail.com", "vamshi123")
			.search("mackbook")
				.logout();

		
		e.doLogin()
		.search("mackbook")
			.addtoCart("mackbook pro")
				.makePayment("1212 1212 1212 2402", 240)
					.generateOrder()
						.logout();

		
	}

}
