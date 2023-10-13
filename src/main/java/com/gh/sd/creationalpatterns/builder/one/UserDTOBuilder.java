package com.gh.sd.creationalpatterns.builder.one;

import java.time.LocalDate;

//Abstract builder
public interface UserDTOBuilder {
	//methods to build "parts" of product at a time
	UserDTOBuilder withFirstName(String fname) ;

	UserDTOBuilder withLastName(String lname);

	UserDTOBuilder withBirthDate(LocalDate date);

	UserDTOBuilder withAddress(Address address);
	//method to "assemble" final product
	UserDTO build();
	//(optional) method to fetch already built object
	UserDTO getUserDTO();
}

