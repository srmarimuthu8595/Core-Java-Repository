package com.srm.runtimepolymorphism;

public class MyTesting {
	
	public static void main(String args[]) {
	      
		
		  Animal a = new Animal();   // Animal reference and object
	      Animal b = new Dog();   // Animal reference but Dog object

	      a.move();   // runs the method in Animal class
	      b.move();   // runs the method in Dog class
	      
	      
	       Child obj = new Child();
	       obj.add(10, 10);
	       obj.add(20, 30.1f);
	      
	       Parent pobj = new Child(); // This is called upcasting
	       pobj.add(10, 10);
	       pobj.add(20, 30.1f);
	      
	      
	       Child cobj = new Parent(); //This is called downcasting
	      //cobj.add(10, 20);
	      
	      
	      
	      
	}

}
