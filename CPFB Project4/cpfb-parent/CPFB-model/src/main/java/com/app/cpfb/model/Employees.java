package com.app.cpfb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Entity
@Table(name = "EMPLOYEES")
@Component
public class Employees {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "empId")
private long empId;
private String accountnumber;
private String employeename;  
private String employeedob; 
private String age; 

public long getEmpId() {
	return empId;
}
public void setEmpId(long empId) {
	this.empId = empId;
}

public String getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(String accountnumber) {
	this.accountnumber = accountnumber;
}
public String getEmployeename() {
	return employeename;
}
public void setEmployeename(String employeename) {
	this.employeename = employeename;
}
public String getEmployeedob() {
	return employeedob;
}
public void setEmployeedob(String employeedob) {
	this.employeedob = employeedob;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}

}
