package com.gh.sd.creationalpatterns.builder.one;

import lombok.Getter;

@Getter
public class Address {

	private String houseNumber;
	
	private String street;
	
	private String city;
	
	private String zipcode;
	
	private String state;

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
