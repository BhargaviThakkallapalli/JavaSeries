package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		
	
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(100);//0
		marksList.add(200); //1
		marksList.add(11); //2
		marksList.add(20); //3
		
		System.out.println(marksList.get(2));
		
		marksList.remove(2);
		
		System.out.println(marksList.get(2));
		
		marksList.add(400);
		System.out.println(marksList.get(3));
		
		marksList.add(0, 150);
		System.out.println(marksList.get(0));
		
		for(int i=0; i<marksList.size(); i++)
		{
			System.out.println(i+":"+marksList.get(i));
		}
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(1);
		ar.add(20);
		ar.add(19);
		Collections.sort(ar);
		System.out.println(ar);
		System.out.println("min value:" +ar.get(0));
		System.out.println("max value:" +ar.get(ar.size()-1));
		
		
		System.out.println(ar);
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1020);
		ar1.add(10);
		ar1.add(200);
		ar1.add(190);
		System.out.println(ar1);
		
		ar1.addAll(ar);
		System.out.println(ar1);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mahi");
		names.add("vamshi");
		names.add("Bhargavi");
		names.add("Laxmi");
		
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);
		
		Collections.sort(names);
		System.out.println(names);
	
		Collections.swap(names, 1, 2);
		System.out.println(names);
		
		ArrayList<String> emp = new ArrayList<String>();
		emp.add("Mahi");
		emp.add("vamshi");
		emp.add("Bhargavi");
		emp.add("Laxmi");
		emp.add("Jasmitha");
		
		if(emp.contains("Mahi"))
		{
			System.out.println("Mahi is present");
		}
				
		
//		int arr[] = {1, 2, 3, 4, 11};
//		// System.out.println(arr);
//		System.out.println(Arrays.toString(arr));
//		
//		
		
		
		
	}

}
