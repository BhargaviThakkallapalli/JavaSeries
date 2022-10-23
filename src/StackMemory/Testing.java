package StackMemory;

public class Testing {
	
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
		// TODO Auto-generated method stub

		Testing t = new Testing();
		t.m1();
		
		
	}

}
