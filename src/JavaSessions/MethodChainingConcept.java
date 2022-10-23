package JavaSessions;

public class MethodChainingConcept {

	public int getTotalBill(int userCount, int code) {

		int tax = 100;
		int bill = 1000;
		int totalBill = tax + bill;

		return totalBill;
	}

	public void m1() {
		m2();
	}

	public void m2() {
		m3();
	}

	public void m3() {
		System.out.println("bye");
	}

	public static void main(String[] args) {
   
		MethodChainingConcept obj = new MethodChainingConcept();
		
		obj.m1();
		
		
		
		//int billAmount = obj.getTotalBill(10,2);
		//System.out.println(billAmount);
		
		
		
		
		
		
	}

}
