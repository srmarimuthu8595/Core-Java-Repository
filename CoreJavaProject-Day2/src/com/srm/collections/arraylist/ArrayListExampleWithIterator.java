package com.srm.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ArrayListExampleWithIterator {
		
	
	public static void main(String arg[]){
		
		ArrayListExampleWithIterator obj = new ArrayListExampleWithIterator();
		
		obj.arrayListWithIterator();
		
		
	}
		
	public void arrayListWithIterator(){
		
		List<Student> list = new ArrayList<Student>();
		Student std1 = new Student(1,"Marimuthu R","Compter Science");
		Student std2 = new Student(2,"Chinnasamy R","IT"); 
		Student std3 = new Student(3,"Senthilkumar R","Compter Science");
		list.add(std1);
		list.add(std2);
		list.add(std3);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			
			Student std =(Student)itr.next();
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
