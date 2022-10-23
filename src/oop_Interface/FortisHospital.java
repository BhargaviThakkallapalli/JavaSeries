package oop_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical, WHO{

	//US
	@Override
	public void pediaServies() {
		System.out.println("FH -- pediaServies ");
	}

	@Override
	public void physioServices() {
		System.out.println("FH -- physioServies ");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH -- orthoServies ");

	}

	//UK
	@Override
	public void ENTServices() {
		System.out.println("FH -- ENTServices ");

	}

	@Override
	public void cardioServices() {
		System.out.println("FH -- cardioServices ");

	}

	//INdian
	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices ");
		
	}

	@Override
	public void nueroServices() {
		System.out.println("FH -- nueroServices ");
		
	}
	
	//Individual
	public void pathologyServices()
	{
		System.out.println("FH -- pathologyServices ");

	}
	public void OPServices()
	{
		System.out.println("FH -- OPServices ");

	}
    // common Interface method
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices ");
		
	}

	@Override
	public void covid19News() {
		System.out.println("FH -- covid19News ");
		
	}

	@Override
	public void covid19Vaccination() {
		System.out.println("FH -- covid19Vaccination ");
				
	}

	// these methods are overridden with overloaded 
	@Override
	public void dentalServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dentalServices(int dentists) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dentalServices(int dentists, String dentalMachine) {
		// TODO Auto-generated method stub
		
	}
	//method hiding:
	//static methods cannot be overridden
	 public static void medicalTraining() {
		 System.out.println("fortis ---  Medical training");
	 }
	 
	// can we override default method from interface:
	 //yes , we can override default method using public keyword in class
	 //default keyword is used in Interface only
	 public void donation(){
		 System.out.println("fortis --- medical donation");
	 }
	 
	
	
	

}
