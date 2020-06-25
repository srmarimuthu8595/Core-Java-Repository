package com.srm.object;

public class MainCalss {
	
	 int a;
	 
	  static {
		  System.out.println("Satic Block Called");
	  }
	
	  public MainCalss(){
		  System.out.println("Construction Called");
	  }
	  
	  public MainCalss(String str){
		  System.out.println("One Augument Construction Called value"+str);
	  }
	  
	  public MainCalss(String name1, String name2){
		  System.out.println("One Augument Construction Called value "+name1+" "+name2);
	  }
	
	

	public static void main(String[] args) {
		
		MainCalss obj = new MainCalss("Marimuthu R","Chinnasamy R");
		

	}

}
