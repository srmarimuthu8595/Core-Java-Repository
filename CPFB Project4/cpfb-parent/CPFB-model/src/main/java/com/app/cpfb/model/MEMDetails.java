package com.app.cpfb.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "MEMDETAILS")
@Component
public class MEMDetails {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "memId")
private long memId;
private String name;
private String accountnumber;
private String month;

@Transient
private  List<MEMContribution> mEMContributionList;


public long getMemId() {
	return memId;
}
public void setMemId(long memId) {
	this.memId = memId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(String accountnumber) {
	this.accountnumber = accountnumber;
}
public String getMonth() {
	return month;
}
public void setMonth(String month) {
	this.month = month;
}

public List<MEMContribution> getmEMContributionList() {
	return mEMContributionList;
}
public void setmEMContributionList(List<MEMContribution> mEMContributionList) {
	this.mEMContributionList = mEMContributionList;
}

}
