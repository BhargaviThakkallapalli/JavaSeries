package oop_InheritanceAssignment;

public class TestHospital {

	public static void main(String[] args) {

		Hospital h = new Hospital(); // Parent class Object
		h.Building();
		h.Equipment();
		h.SpecialisedDoctors();
		System.out.println("------------------");

		Apollo a = new Apollo(); // Child class Object
		a.Building();// Overridden
		a.Equipment(); // Inherited
		a.SpecialisedDoctors();// Overridden
		a.HeartTreatment(); //// individual
		System.out.println("------------------");

		Fortis f = new Fortis(); // Child class Object
		f.Building();// Inherited
		f.Equipment(); // Overridden
		f.SpecialisedDoctors();// Inherited
		f.CancerTreatment(); // individual
		f.SeniorCitizenCards(); // individual
		System.out.println("------------------");

		Max m = new Max();// Child class Object
		m.Building(); // Inherited
		m.Equipment(); // Overridden
		m.SpecialisedDoctors(); // Inherited
		m.Insurance(); // individual
		m.Payment(); // individual
		System.out.println("------------------");

		// Top casting
		Hospital h1 = new Apollo();
		h1.Building();
		h1.Equipment();
		h1.SpecialisedDoctors();
		System.out.println("------------------");

		// Top casting
		Hospital h2 = new Fortis();
		h2.Building();
		h2.Equipment();
		h2.SpecialisedDoctors();
		System.out.println("------------------");

		// Top casting
		Hospital h3 = new Max();
		h3.Building();
		h3.Equipment();
		h3.SpecialisedDoctors();

		//Down casting: No use case
				//parent class object can be referred by child class ref variable 
				//every Hospital is not Apollo, Fortis, Max
	//Apollo a1 = (Apollo) new Hospital(); //ClassCastException
	// Fortis f1 = (Fortis)new Hospital(); //ClassCastException 
	// Max m1 = (Max) new Hospital(); //ClassCastException
				// it is not used any where in frame
				
		
		
	}

}
