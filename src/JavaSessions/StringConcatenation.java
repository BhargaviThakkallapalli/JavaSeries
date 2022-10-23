package JavaSessions;

public class StringConcatenation {
//combining two things
	
	public static void main(String[] args) {
	
		int a = 100;
		int b = 200;
        System.out.println(a+b); // addition
        
        String x = "hello";
        String y = "world";
        
        double d1 = 12.33;
        double d2 = 12.44;
        
        char c ='a';
        char c2 = 'b';
        
        //concatenation : Strings can be concatenated with anything
        //left to right execution
        System.out.println(x+y); // any + with string concatenation
        System.out.println(a+x);
        System.out.println(x+a);
        System.out.println(x+y+a+b);//helloworld100200 - o/p
        System.out.println(x+y+(a+b)); //helloworld300- o/p
        System.out.println(a+b+x+y); //300helloworld
        
        System.out.println("the value of a : " +a);
        System.out.println("the value of b: " +b);
        System.out.println("the sum is: " + (a+b));
        System.out.println(a+b+x+y+a+b);
        System.out.println(a+b+x+y+(a+b));
        
        System.out.println(x+y+d1+d2);
        System.out.println(x+c);
        System.out.println(x+y+(c+c2)); //helloworld195
        
        
         

		
		
		
		
	}

}
