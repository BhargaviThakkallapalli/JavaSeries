package oop_InheritanceAssignment;

public class Apollo extends Hospital {

	@Override
	public void Building() {
		System.out.println("Apollo -- Building");
	}

	public void HeartTreatment() {
		System.out.println("Apollo--Heart treatment");
	}

	@Override
	public void SpecialisedDoctors() 
	{
      System.out.println("Apollo -- Specialised doctors");
	}
}
