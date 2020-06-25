package com.srm.loopings;

import java.util.ArrayList;
import java.util.List;

public class ForLoopExample2 {
	
	
	public static void main(String arg[]){
		
		ForLoopExample2 obj = new ForLoopExample2();
		
		//obj.stringForLoop();
		//obj.integerForLoop();
		obj.customObjectForLoop();
	}
	
	
	public void stringForLoop(){
		
		List<String> list = new ArrayList<String>();
		list.add("Chinnasamy R");
		list.add("Marimuthu R");
		list.add("Senthilkumar R");
		list.add("Babu G");
		list.add("Saravana K");
		
		for(String name : list){
		    System.out.println("Name :"+name);
		}
    }
	
	public void integerForLoop(){
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(new Integer(5));
		
		for(Integer value:list){
			System.out.println("Value :"+value);
		}
		
	}
	
	public void customObjectForLoop(){
		
				
		List<Student> list = new ArrayList<Student>();
		Student std1 = new Student(1,"Marimuthu R","Compter Science");
		Student std2 = new Student(2,"Chinnasamy R","IT"); 
		Student std3 = new Student(3,"Senthilkumar R","Compter Science");
		list.add(std1);
		list.add(std2);
		list.add(std3);
			
	
		
		for(Student std :list){
			
			System.out.println("Student Id :"+std.sudentId+" Student Name :"+std.name+" Department : "+std.department);
			
		}
		
		
	}
	
	
	private class Student{
		
	   public int sudentId;
	   public String name;
	   public String department;
	   
	   public Student(int sudentId, String name, String department) {
			super();
			this.sudentId = sudentId;
			this.name = name;
			this.department = department;
		}
	
		public int getSudentId() {
			return sudentId;
		}
	
		public void setSudentId(int sudentId) {
			this.sudentId = sudentId;
		}
	
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
		public String getDepartment() {
			return department;
		}
	
		public void setDepartment(String department) {
			this.department = department;
		}
				
	}
	
	
	
	
	
	 
	
    

}
