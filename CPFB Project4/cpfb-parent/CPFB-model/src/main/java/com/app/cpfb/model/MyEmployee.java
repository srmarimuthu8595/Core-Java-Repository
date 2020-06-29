package com.app.cpfb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "MYEMPLOYEES")
@Component
public class MyEmployee {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "empId")
private long empId;
private String fullname;
private String email;  
private String phonenumber; 
private String contactpreferences; 
private String gender;
private String department;

public long getEmpId() {
	return empId;
}
public void setEmpId(long empId) {
	this.empId = empId;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getContactpreferences() {
	return contactpreferences;
}
public void setContactpreferences(String contactpreferences) {
	this.contactpreferences = contactpreferences;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}


}
