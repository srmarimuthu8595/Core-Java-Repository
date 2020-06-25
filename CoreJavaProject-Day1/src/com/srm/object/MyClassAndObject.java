package com.srm.object;

public class MyClassAndObject {

	  
	  public MyClassAndObject(){
		 System.out.println("Java is a object oriented programming lanuage");		  
	  }
	   
      public MyClassAndObject(int a,int b){
    	  System.out.println("The value of a : "+a);
    	  System.out.println("The value of b : "+b);
      }
      
      public MyClassAndObject(int a,int b,int c){
    	  
    	  System.out.println("The value of a : "+a);
    	  System.out.println("The value of b : "+b);
    	  System.out.println("The value of c : "+c);
    	  
      }
      
      public MyClassAndObject(int a,int b,int c,int d){
    	  
    	  System.out.println("The value of a : "+a);
    	  System.out.println("The value of b : "+b);
    	  System.out.println("The value of c : "+c);
    	  System.out.println("The value of d : "+d);
    	  
      }
       	
		
	  public static void main(String[] args) {
		
		  // MyClassAndObject ojb = new MyClassAndObject();
		  
		  MyClassAndObject ojb2 = new MyClassAndObject(10,10);
		   
		  //MyObject ojb3 = new MyObject(10,20,30);
		  
		  // MyObject ojb4 = new MyObject(10,20,30,40);
		  
		  
		  
	  }

}
