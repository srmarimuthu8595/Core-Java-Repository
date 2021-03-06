package com.srm.creational;

public class Singleton {
	
    private static Singleton singleinstance = null; 
   
    public String s; 
      
    private Singleton() 
    { 
       
    } 
    
    public static Singleton getInstance() 
    { 
        if (singleinstance == null){ 
        	singleinstance = new Singleton();
        }
          return singleinstance; 
    } 

}
