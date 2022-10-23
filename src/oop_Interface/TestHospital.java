package oop_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.pediaServies();
		fh.cardioServices();
		fh.emergencyServices();
		fh.oncologyServices();
		fh.publishMedicalNews();
		fh.medicalResearch();
		
		System.out.println(USMedical.min_fee);
		System.out.println(FortisHospital.min_fee);
		//top casting:
		//child class object can be referred by parent interface ref variable
		
		//reference type check will be passed only for below services. 
		// remaining will be failed
		USMedical us = new FortisHospital();
		
		us.emergencyServices();
		us.pediaServies();
		us.physioServices();
		us.orthoServices();
		
	}

}
