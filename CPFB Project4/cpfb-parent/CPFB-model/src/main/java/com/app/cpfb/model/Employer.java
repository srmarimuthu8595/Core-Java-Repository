package com.app.cpfb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "EMPLOYER")
@Component
public class Employer {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "employerId")
private long employerId;
private String emprname;
private String empraddress;
private String indutry;
private String  gstno;
private String emprnumber; 

public long getEmployerId() {
	return employerId;
}
public void setEmployerId(long employerId) {
	this.employerId = employerId;
}

public String getEmprnumber() {
	return emprnumber;
}
public void setEmprnumber(String emprnumber) {
	this.emprnumber = emprnumber;
}
public String getEmprname() {
	return emprname;
}
public void setEmprname(String emprname) {
	this.emprname = emprname;
}
public String getEmpraddress() {
	return empraddress;
}
public void setEmpraddress(String empraddress) {
	this.empraddress = empraddress;
}
public String getIndutry() {
	return indutry;
}
public void setIndutry(String indutry) {
	this.indutry = indutry;
}
public String getGstno() {
	return gstno;
}
public void setGstno(String gstno) {
	this.gstno = gstno;
}

}
