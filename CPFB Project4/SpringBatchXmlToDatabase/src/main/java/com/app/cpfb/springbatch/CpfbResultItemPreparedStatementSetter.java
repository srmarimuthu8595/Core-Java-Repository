package com.app.cpfb.springbatch;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.app.cpfb.springbatch.model.EmployerContribution;


public class CpfbResultItemPreparedStatementSetter implements ItemPreparedStatementSetter<EmployerContribution> {

	public void setValues(EmployerContribution employerContribution, PreparedStatement ps) throws SQLException {
		ps.setString(1, employerContribution.getEmployeeName());
		ps.setString(2, employerContribution.getEmployerName());
		ps.setString(3, employerContribution.getMonth());
		ps.setInt(4, employerContribution.getSalary());
	
	}

}
