package JavaSessions;

/**
 * 
 * @author vamsh
 * Date: June 30th 2022
 *
 */
public class DataTypesConcept {

	public static void main(String[] args) {
		
		//data types: indicates a type of data
		//strict data type
		//1. primitive data types
		// no need to create any object
		//a. boolean type: boolean (true/false)
		//b. Numeric type:
		    //b.1: character type: char
		    //b.2: Integral type:
		        //b.2.1: Integer: byte, short, int, long
		        //b.2.2: floating-point: float, double
		  
		//2. non primitive data types: class, String, Array, interface, Abs class
	    // we have to create object for non primitive data types
		//non primitive data types should start with capital letter.
		
		//b.2.1: Integer 
		//1. byte:
		//size: 1 byte = 8bits
		//range: -128 to 127
		//2*2*2*2*2*2*2*2
		byte b=1;
		b=24;
		System.out.println(b);
		
		//2. short:
		//size: 2 bytes = 2*8 = 16bits
		//range: -32768 to 32767
		short s = 10000;
		System.out.println(s);
		
		//3. int:
		//size: 4 bytes = 4*8 = 32 bits
		//range: -2147483648 to 2147483647
		//-2^32 to 2^32-1
		int i = 1212121;
		System.out.println(i);
		
		//4.long:
		//size: 8 bytes = 8*8 = 64 bits
		//range: -2^64 to 2^64-1
		long num = 8888888888888l; //Should write 'L' for long
		System.out.println(num);
		
	//b.2.2: floating-point
		//5. float:
		//size: 4 bytes = 4*8 = 32 bits
		float f = 12.33f; //mandatory to write f at the end
		float f1 = (float)3.44;
		System.out.println(f);
		System.out.println(f1);
		float f2 = 100;
		System.out.println(f2);
		
		//6. double:
		//size: 8 bytes = 8x8 = 64 bits
		double d = 12.3333;
		double d1 = -123.4444;
		System.out.println(d);
		double d2 = 24.02;
		System.out.println(d1+d2);
		
		//7. char: characters are considered as a numeric value
		//size: 2 bytes = 16 bits
		char c = 'a';//should always written in single quote
		char cc3 = 'b';
		char c1 = '1';
		char c2 = '$';
		System.out.println(c);
		System.out.println((int)c);
        System.out.println(c+cc3);//97+98 =195
        
        //range:
        //a-z: 97 to 122
        //A-Z: 65 to 90 
        //0-9: 48 to 57
        
        char gender = 'f';
        char currency = '$';
        
        //8. boolean: true/false
        //size: ~1 bit
        boolean bl = true;
        boolean bl1 = false;
        
        System.out.println(bl);
        System.out.println(bl1);
        
        
        
				
		
		
	}

}
