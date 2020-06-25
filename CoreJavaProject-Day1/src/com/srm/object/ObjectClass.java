package com.srm.object;

public class ObjectClass {
	
	public String empname;
	public int age;
	public String dept;
		
	public ObjectClass(String empname,int age,String dept){
	   this.empname=empname;
	   this.age=age;
	   this.dept=dept;
	}
	
	public String toString(){
		return "Name :"+empname+"  Age :"+age+"  Department :"+dept;
	}

	public static void main(String[] args) {
		
		ObjectClass obj = new ObjectClass("Chinnasamy R",35,"Commercial Bank");
		
		System.out.println(obj);
		
		System.out.println("Hash Code :"+obj.hashCode());
				
		System.out.println("Get Class :"+obj.getClass());
	}

}
