package Practicesessions;

public class ArraysPractice {

	public static void main(String[] args) {
		// while loop and do-while loop
		//first condition then statement- while
		//at least statement should be executed once then we are checking the condition 
		
		//1.Array 
		//dis: we can store only similar data types. cannot be able store different data types.
		//size is always fixed. we cannot go beyond the size.
		//AIOB(Array Index Out Of bound exception)
		//Object array is used to store different data types.
		
		
		
		
		//1. int array:
		//reverse order printing.
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		for(int j=i.length-1; j>=0; j-- )
		{
			System.out.println(i[j]);
		}
		
		Object obj = new Object();
		obj.equals(20);
		
	}

}
