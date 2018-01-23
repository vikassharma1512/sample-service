package io.swagger.samples.inflector.springboot.models;

import java.util.Date;

public class UserDetails {

	private String name;
	private Date dob;

	UserDetails() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
