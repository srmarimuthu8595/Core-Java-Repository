package com.srm.methodoverloading;

public class CompileTime {
	
	
	public void car(String  name,String model,String enginetype){
		String str = "Carname :"+name+" Model :"+model+" Engiletype :"+enginetype;
	    System.out.println("str");
	
	}
	
	
	public void car(String  name,String model,String enginetype,String ac){
		String str = "Carname :"+name+" Model :"+model+" Engiletype :"+enginetype+""+ac;
		System.out.println(str);
	}
	
	public void car(String  name,String model,String enginetype,String ac,String otheramendments){
		String str = "Carname :"+name+" Model :"+model+" Engiletype :"+enginetype+""+ac+""+otheramendments;
		System.out.println(str);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
