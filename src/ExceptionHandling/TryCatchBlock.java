package ExceptionHandling;

public class TryCatchBlock {
	String name;

	public static void main(String[] args) {
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		int a = 9;
		int b =3;
		
		
//Thread.sleep(4000);
		
		try {
			
			TryCatchBlock obj = new TryCatchBlock();
			obj = null;
			obj.name="Mahi"; //NPE
			int i = a/b;// AE
			
		}catch(ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println("NPEis coming....");
			e.printStackTrace();
		}
		
		System.out.println("bye");
		
	}

}

