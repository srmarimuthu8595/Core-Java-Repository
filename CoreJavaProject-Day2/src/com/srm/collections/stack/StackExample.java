package com.srm.collections.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExample {
	
	static void displayPUSH(Stack st, int a) {
	      st.push(new Integer(a));
	      System.out.println("push(" + a + ")");
	      System.out.println("stack: " + st);
	   }

	   static void dispalyPOP(Stack st) {
	      System.out.print("pop -> ");
	      Integer a = (Integer) st.pop();
	      System.out.println(a);
	      System.out.println("stack: " + st);
	   }

	   public static void main(String args[]) {
	    
		   Stack st = new Stack();
	      System.out.println("stack: " + st);
	      displayPUSH(st, 42);
	      displayPUSH(st, 66);
	      displayPUSH(st, 99);
	      dispalyPOP(st);
	      dispalyPOP(st);
	      dispalyPOP(st);
	      
	      try {
	    	  dispalyPOP(st);
	      } catch (EmptyStackException e) {
	         System.out.println("empty stack");
	      }
	   }

}
