package com.srm.abstractclasses;


public class CurrentAccountStmtPrint extends CurrentAccountStmtPrintParent {
	
	public String getCurrentAccountStatementDetails(String accno,String fromdate,String todate){
		String str = accno+"||"+fromdate+"||"+todate+"||"+"Balance Ammount :20000";
		return str;
	}
	
	public static void main(String arg[]){
		
		StringBuffer strbuff = new StringBuffer();
		
		CurrentAccountStmtPrint obj = new CurrentAccountStmtPrint();
		
		String bankdetails=obj.getBankDetails();
		
		strbuff.append(bankdetails).append("||");
		
		String ifsccode = obj.getIFSCCode();
		
		strbuff.append(ifsccode).append("||");
				
		String sbaccstmt =obj.getCurrentAccountStatementDetails("CA100200300","01-06-2020","15-06-2020");
		
		strbuff.append(sbaccstmt);
		
		obj.downlodExcel(strbuff);
		

   }
	
}
