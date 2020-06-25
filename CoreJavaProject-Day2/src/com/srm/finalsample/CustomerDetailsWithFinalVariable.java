package com.srm.finalsample;

public class CustomerDetailsWithFinalVariable {
	
    private final int customerNumber=10001;
    private final String customerName="Marimuthu R";
    private final String accountNumber="SBI002004005006";
    private final int phoneNumber;        // Blank final variable
    private static final int pincodeNumber; // Blank final variable
    
        
    static{
    	pincodeNumber=638455;
    }
       
    public CustomerDetailsWithFinalVariable(){
    	phoneNumber=638455;
    
    }
    
    public void displayCustomerDetails(){
    	
    	//customerNumber=10002;
    	//customerName="Chinnasamy R";
    	//accountNumber="SBI002004005007";
    }
        
    
    public static void main(String[] args) {
		
    	
    	
	}

}
