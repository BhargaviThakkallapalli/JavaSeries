package JavaSessions;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		// ArrayList with Generics:
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(100);
		marksList.add(200);
		
		ArrayList<Double> bmiList = new ArrayList<Double>();
		
		bmiList.add(12.02);
		bmiList.add(24.02);
		
		ArrayList<String>empNamesList = new ArrayList<String>();
		
		empNamesList.add("Mahansh");//0
		empNamesList.add("Mahi"); //1
		empNamesList.add("Laxmi"); //2
		empNamesList.add("Vamshi");//3
		
		System.out.println(empNamesList.size());
		
		//for index:
		
		for(int i =0; i<empNamesList.size(); i++)
		{
			System.out.println(empNamesList.get(i));
		}
		
		//foe each:
		for (String e : empNamesList)
		{
			System.out.println(e);
		}
		
		//AC:
		//design a list of employee data:
		
		ArrayList<Object>empData = new ArrayList<Object>();
		
		empData.add("Mahansh");
		empData.add(0.45);
		empData.add(24.02);
		empData.add(true);
		empData.add('m');
		
		for(Object e : empData)
		{
			System.out.println(e);
		}
		
		
		for (int j=4; j>empData.size();j--)
		{
			System.out.println(empNamesList.get(j));
		}
		

	}

}
