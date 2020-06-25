package com.srm.abstractclasses;


public class SavingAccountStmtPrint extends SavingsAccountStmtPrintParent {

	public String getSavingAccountStatementDetails(String accno,String fromdate,String todate){
		String str = "Bank Accoun No: "+accno+" || From Date :"+fromdate+" || To Date :"+todate+"||"+"Balance Ammount :20000";
		return str;
	}
	
	public static void main(String arg[]){
		
		StringBuffer strbuff = new StringBuffer();
		
		SavingAccountStmtPrint obj = new SavingAccountStmtPrint();
		
		String bankdetails=obj.getBankDetails();
		
		strbuff.append(bankdetails).append("||");
		
		String ifsccode = obj.getIFSCCode();
		
		strbuff.append(ifsccode).append("||");
				
		String sbaccstmt =obj.getSavingAccountStatementDetails("SBI0010","01-06-2020","15-06-2020");
		
		strbuff.append(sbaccstmt);
		
		obj.printPDF(strbuff);
		
		
	}

}
