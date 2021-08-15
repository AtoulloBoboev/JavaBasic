package com.neotech.lesson25;

public class Doctor {
	
	private String licenseID;
	private long phoneNb;
	private String email;
	
	
	public long getPhoneNb() {
		return phoneNb;
	}
	public void setPhoneNb(long phoneNb) {
		
		if(phoneNb == 0000) {
			this.phoneNb = phoneNb;
		} else {
			System.out.println("This is wrong number!");
		}
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		//We have some conditions
		if(!email.isEmpty()) {
			if(email.contains("gmail")) {
				this.email = email;
			} else {
				System.out.println("You have to use gmail!");
			}
		
		
	} else {
		System.out.println("The email cannot be empty!!");
		}
	}

}
