package oop_encapsulation;

public class TestEmp {

	public static void main(String[] args) {
       
//		 e1.setName("mahi");
//	     e1.setAge(0);
//	     e1.setPerm(true);
//		 
//	
		
         //CRUD		
		 Employee e1 = new Employee("mahi", 0, true);
		 
		 //GET -- retrieve
		 System.out.println(e1.getName());
	     System.out.println(e1.getAge());
	     System.out.println(e1.isPerm());
	     
	     e1.setAge(1);//PUT - update
	     System.out.println(e1.getName());
	     System.out.println(e1.getAge());
	     System.out.println(e1.isPerm());
	     
	}

}
