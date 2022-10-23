package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//ArrayList - default class. // it is also called as dynamic array
		//Maintains the order
		//Create the object of the ArrayList: with new keyword
		
		ArrayList ar = new ArrayList(); // empty ArrayList  -- VC =10
		System.out.println(ar.size());//0
		
		ar.add(100); //0 index
		ar.add(200); //1 index 
		
		System.out.println(ar.size()); //size is 2
		
		ar.add(300); //2 
		ar.add(400); //3
		
		System.out.println(ar.size()); //size is 4
		
		ar.add(500); //4 
		ar.add(600); //5
		
		System.out.println(ar.size()); //size is 6
		
		//increment of virtual memory will be decide by java
		//initially it will allocate 10 virtual segments
		//no concept of initial size
		// we can add more and more values then it will increase the size of the data
		// to fetch the data we will use get method
		
		System.out.println(ar.get(0));
		/// System.out.println(ar.get(6));//IOB
		//System.out.println(ar.get(-1));//IOB
		
		//to print all the values of ArrsyList: for loop or for each loop
		
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
