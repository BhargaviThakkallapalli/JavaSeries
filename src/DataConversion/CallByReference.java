package DataConversion;

public class CallByReference {
	
	String name;
	int age;

	public void getInfo(CallByReference t1) {
		
		t1.name = "jasmi";
		t1.age = 7;
	}
	
	
	public static void main(String[] args) {
		
		CallByReference obj = new CallByReference();
		obj.name = "Mahi";
		obj.age =164;
		
		System.out.println(obj.name + " " +obj.age);
		
		obj.getInfo(obj);
		
		System.out.println(obj.name + " " +obj.age);
		
		
	}

}
