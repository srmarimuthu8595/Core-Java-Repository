package com.srm.abstractclasses;

public abstract class CurrentAccountStmtPrintParent {
	
	 public String getBankDetails(){
		 String str="Bank Details : SBI Bank,Nugampakkam,Chennai";
		 return str;
	 }
	 
	 public String getIFSCCode(){
		 String ifsccode = "IFSC Code : SBI001";
		 return ifsccode;
	 }
	 
	 public void printPDF(StringBuffer str){
		 System.out.println("Bank Statement in PDF format is : "+str.toString());
	 }
	 
	 public void downlodExcel(StringBuffer str){
		 System.out.println("Bank Statement in Excel format is : "+str.toString());
	 }
	 
	 public abstract String getCurrentAccountStatementDetails(String accno,String fromdate,String todate);


}
