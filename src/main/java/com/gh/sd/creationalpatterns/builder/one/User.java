package com.gh.sd.creationalpatterns.builder.one;

import lombok.Getter;

import java.time.LocalDate;

//Class used to construct the product
@Getter
public class User {

	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Address address;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}
