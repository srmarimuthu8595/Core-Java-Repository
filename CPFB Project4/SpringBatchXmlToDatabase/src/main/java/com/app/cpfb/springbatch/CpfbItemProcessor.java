package com.app.cpfb.springbatch;

import org.springframework.batch.item.ItemProcessor;

import com.app.cpfb.springbatch.model.EmployerContribution;
import com.app.cpfb.springbatch.rules.EmployerContributionRules;

public class CpfbItemProcessor implements ItemProcessor<EmployerContribution, EmployerContribution>{

	public EmployerContribution process(EmployerContribution employerContribution) throws Exception {
		System.out.println("Processing result :"+employerContribution);
		
		employerContribution.setSalary(EmployerContributionRules.employerContributionRules(employerContribution.getSalary()));
		return employerContribution;
	}

}
