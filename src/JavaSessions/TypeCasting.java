package JavaSessions;

public class TypeCasting {

	public static void main(String[] args) {
		// TypeCasting:
		   //1. Widening TypeCasting:
		// Auto conversion of lower data types values to higher types:
		
		
	    byte b = 2;
	    short s = b;
	    int i = b;
	    long l = b;
	    System.out.println(i);
	    System.out.println(l);
		System.out.println(b);
		System.out.println(s);
		
		//2. Narrowing TypeCasting:
		//conversion of higher data types to data types
		
		int p = 100;
		short s1 = (short)p;
		byte b1 = (byte)p;
		System.out.println(s1);
		System.out.println(b1);
		
		byte m = 100;
		byte n = 114;
		int t = m+n;
		byte t1 = (byte)(m+n);
		System.out.println(t);
		System.out.println(t1);
		
		char j = 97;
		System.out.println(j);
		System.out.println(j+'b');
		
		
	}

}
