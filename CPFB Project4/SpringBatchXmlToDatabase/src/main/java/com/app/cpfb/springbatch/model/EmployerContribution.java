package com.app.cpfb.springbatch.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "EmployerContribution")
public class EmployerContribution {
	
	private String employeeName;
	private String employerName;
	private String month;
	private int salary;
	
	@XmlElement(name = "employeeName")
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	@XmlElement(name = "employerName")
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	
	@XmlElement(name = "month")
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	
	/*@XmlElement(name = "amount")
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
  */
	@XmlElement(name = "salary")
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
