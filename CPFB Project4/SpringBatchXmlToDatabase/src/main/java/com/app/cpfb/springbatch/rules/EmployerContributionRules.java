package com.app.cpfb.springbatch.rules;

public class EmployerContributionRules {
	
	public static int employerContributionRules(int salary) {
			
		  int number=0;  
		  switch(salary){  
		  
		  case 25000: number=salary+1000;  
		    
		  case 35000: number=salary+1500;
		   
		  case 45000: number=salary+2000;
		   
		  default: number=salary+500;  
		  
		  }  
		
		
		
		
		return number;
	 	
	}

}
