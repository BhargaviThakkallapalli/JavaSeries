package JavaSessions;

public class ArraysConcept {

	public static void main(String[] args) {
		
		//arrays:
		//limitation of array: 
		//1. similar type of data only: to overcome this issue, we have to use: dynamic array: ArrayList or objectArray
//2. size is fixed: static array: to overcome this issue, we have to use: dynamic array: ArrayList
		
		
		//1. int array:
		
		//a. using new keyword:
		int i[] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]); //ArrayIndexOutOfBoundException
		//System.out.println(i[-1]); //ArrayIndexOutOfBoundException
		
		System.out.println(i.length);
		int len = i.length;
		int li =0;
		int hi = len-1;
		System.out.println("li = "+li);
		System.out.println("hi = " +hi);
		System.out.println("lngth = " +len);
		
		
		//to print all the values from array: iterate this array: for loop:
		for(int j =0; j<4; j++)
		{
			System.out.println(i[j]);
		}
		
		System.out.println("---Reverse order---");
		//to print the reverse order:
		for(int m=i.length-1; m>=0; m--)
		{
			System.out.println(i[m]);
		}
		
//2. double:
		double d[] = new double[2];
		d[0] = 12.33;
		d[1] = 24.44;
		System.out.println(d[0]);
		
//3. char
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '$';
		c[2] = 'b';
		System.out.println(c[0]+c[2]); //o/p is 195
		
		for(int g=0; g<c.length; g++)
		{
			System.out.println(c[g]);
		}
		
		
		
		int k[] = new int[5];
		//k[2] = 20;
		System.out.println(k[0]);
		System.out.println(k[4]);
		
		
		
		
		
		
		
	}

}
