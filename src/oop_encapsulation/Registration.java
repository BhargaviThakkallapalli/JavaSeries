package oop_encapsulation;

public class Registration {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String password;
	private String emailAddress;
	
	
	public Registration(String firstName, String emailAddress) {
		this.firstName = firstName;
		this.emailAddress = emailAddress;
		
	}
	public Registration(String firstName, String lastName, String password, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.emailAddress = emailAddress;
		}
	public Registration(String firstName, String lastName, String phoneNumber, String password, String emailAddress) {
	    this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.emailAddress = emailAddress;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	
}
