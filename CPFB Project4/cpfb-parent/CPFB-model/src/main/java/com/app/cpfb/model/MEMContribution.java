package com.app.cpfb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "MEMCONTRIBUTION")
@Component
public class MEMContribution {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "memContriId")
	private long memContriId;
	private String comtype;
	private String monthlycontribution;
	private String totalycontribution;
	
	public long getMemContriId() {
		return memContriId;
	}
	public void setMemContriId(long memContriId) {
		this.memContriId = memContriId;
	}
	public String getComtype() {
		return comtype;
	}
	public void setComtype(String comtype) {
		this.comtype = comtype;
	}
	public String getMonthlycontribution() {
		return monthlycontribution;
	}
	public void setMonthlycontribution(String monthlycontribution) {
		this.monthlycontribution = monthlycontribution;
	}
	public String getTotalycontribution() {
		return totalycontribution;
	}
	public void setTotalycontribution(String totalycontribution) {
		this.totalycontribution = totalycontribution;
	}
}
