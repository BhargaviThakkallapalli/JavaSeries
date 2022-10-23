package JavaSessions;

public class LoopsAssignment {

	public static void main(String[] args) {
		//1. WAP to print following output://
		//I am Batman
//		I am Batman
//		I am Batman
//		I am Batman
//		I am Batman
	 int z = 1;
	  while (z <= 5) {
		System.out.println("I am Batman"); 
		z++;
	  }
	  System.out.println("--------");
	//
	  for(int j=1; j<=5; j++)
	  {
		  System.out.println("I am Batman");
	  }
	  System.out.println("--------");
//2. WAP to print following output:
//	  I am Batman 1
//	  I am Batman 2
//	  I am Batman 3
//	  I am Batman 4
//	  I am Batman 5
//	  I am Batman 6
//	  I am Batman 7
//	  I am Batman 8
//	  I am Batman 9
	  // while loop
	  int t = 1;
	  while (t<10) {
		  System.out.println("I am Batman " +t);
		  t++;
	  }
	  System.out.println("*******");
	  for(int m=1; m<10; m++)
	  { 
		  System.out.println("I am Batman " +m);
		  
	  }
	  System.out.println("--------");	
 //3. WAP to print 10 to 1 using for, while and do-while loop  
	  int a = 10;
	  while(a>=1) {
		  System.out.println(a);
		  a--;
	  }
	  System.out.println("*******");
	  
	  for(int b=10; b>=1; b--)
	  { 
		  System.out.println(b);
	  }
	  System.out.println("--------");
	  
	  int rowCount = 10;
	  do {
		System.out.println(rowCount);
		rowCount--;
	} while (rowCount>=1);
	  
	  System.out.println("--------");	
//  4. Write a program in Java to print "Hello World" ten times using while loop
	  int c = 1;
	  while (c<=10) {
		  System.out.println("Hello World");
		  c++;
	  }
	  System.out.println("--------");	
//5. Write a program in Java to print 1 to 10 using while loop
	  int d =1;
	  while(d<=10)
	  {
		  System.out.println(d);
		  d++;
	  }
	  System.out.println("--------");
//6. WAP to find out the max number from the given positive numbers
	
	  
	  
//7. print all odd and even numbers between 1 to 100

	for(int e=1; e<=100; e++)
	{
		if(e%2==1)
		{
			System.out.println(e + " is a odd number");
		}
		else
		{
			System.out.println(e + " is a even number");
		}
	}
	 System.out.println("--------");
	 
	//  or 
	 for (int k=1; k<=100; k=k+1)
	 {
		 if(k%2==1) {
			 System.out.println(k);
}
	}
	 System.out.println("--------");
	 
	 for (int l=1; l<=100; l=l+1)
	 {
		 if(l%2==0) {
			 System.out.println(l);
		 }
	}
	 
//8. What will be the output of this program:
//		 int i = 1;
//		 while(i<=1)
//		 System.out.println("Hi Java"); //o/p: Hi Java Infinity times
	 System.out.println("--------");
//9. Print A-Z , a-z, 0-9 with the respective ASCII numbers on the console.
		
	     for (char f = 'A';f<='Z'; f++)
	     {
	    	 System.out.println(f +":" +(int)f);
	     }
	     for (char g = 'a';g<='z'; g++)
	     {
	    	 System.out.println(g +":" +(int)g);
	     }
	     for (char h = '0';h<='9'; h++)
	     {
	    	 System.out.println(h +":" +(int)h);
	     }
//	     10. Print this series: 
//	     1.0 2.0 3.0  ...... 10.0 
	     double m = 1.0;
	     while (m<=10.0)
	     {
	    	 System.out.println(m);
	    	 m++;
	     }
	     for(double n=1.0; n<=10.0; n++)
	     {
	    	 System.out.println(n);
	     }
//  11. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".   
	     for(int x=1; x<=10; x++)
	     {
	    	 System.out.println(x);
	    	 if(x*1 == 7)
	    	 {
	    		 System.out.println("bye, see you tomorrow");
	    		 break;
	    	 }
	     }
	     
//12. Write a cricket score card system using for and while loops:
//	     if(score == 0) -- print - "Zero - duck"
//	     if(score == 25) -- print - "good job"
//	     if(score == 50) -- print - "good job - half century"
//	     if(score == 100) -- print - "good job - century"
	     int score = 0;
	     while(score<=100)
	     {
	    	 System.out.println(score);
	    	 if(score == 0)
	    	 {
	    		 System.out.println("Zero -duck");
	    	 }
	    	 if(score == 25) 
	    	 {
	    	      System.out.println("good job");
	         }
	    	 if(score == 50) 
	    	 {
	    	      System.out.println("good job - half century");
	         }
	    	 if(score == 100) 
	    	 {
	    	      System.out.println("good job - century");
	         }
	    	 score++;
	     }
	     System.out.println("-------");
	     
	     for(score=0; score<=100;score++)
	     {
	    	 System.out.println(score);
	    	 if(score == 0)
	    	 {
	    		 System.out.println("Zero -duck");
	    	 }
	    	 if(score == 25) 
	    	 {
	    	      System.out.println("good job");
	         }
	    	  if(score == 50) 
	    	 {
	    	      System.out.println("good job - half century");
	         }
	    	 if(score == 100) 
	    	 {
	    	      System.out.println("good job - century");
	         }
	     }
	     score=0;
	     
	     while(score<=100)
	     {
	    	 System.out.println(score);
	    	 if(score == 0)
	    	 {
	    		 System.out.println("Zero -duck");
	    	 }
	    	 if(score == 25) 
	    	 {
	    	      System.out.println("good job");
	         }
	    	  if(score == 50) 
	    	 {
	    	      System.out.println("good job - half century");
	         }
	    	 if(score == 100) 
	    	 {
	    	      System.out.println("good job - century");
	         }
	    	 score++;
	     }
	     
	     System.out.println("+++++");
	   int run = 0;
	   while(run<=100)
	   {
		   System.out.println(run);
		   switch(run) {
		   case 0:
		   System.out.println("zero-duck");
		   break;
		   case 25:
			   System.out.println("good job");
			   break;
		   case 50:
			   System.out.println("good job - half century");
			   break; 
		   case 100:
			System.out.println("good job - century");
			break;
		   } run++;
	   }
	     
	     
	}

}
