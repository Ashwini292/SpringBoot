package com.application.employeeApp;


import javax.persistence.*;
import javax.persistence.Id;

//import java.util.Objects;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cglib.beans.BeanCopier.Generator;
import org.springframework.stereotype.Component;
import org.springframework.data.annotation.*;


@Entity
@Table(name = "employeedetails")
public class Employee {
	@Id
	private int id;
	private String first_name;
	private String last_name;
	private String date_of_birth;
	private String email;
	private String gender;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	  @Override
	  public String toString() {
	    return "Employee{" + "id=" + this.id + ", firstName='" + this.first_name + ",lastName"+ this.last_name+", date_of_birth" + this.date_of_birth +", email" + this.email+", gender"+ this.gender +"}";
	  }
}