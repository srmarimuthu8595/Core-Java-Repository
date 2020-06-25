package com.srm.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.srm.collections.pojos.Person;

public class HashsetExample {
	
public static void main(String agr[]){
		
		Set<Person> hashset  = new HashSet<Person>();
			
		
		Person person = new Person(); 
		person.setName("Marimuthu R");
		person.setAge(40);
		person.setEmpId(220503);
		person.setNativeplace("Singanallur");
		
		System.out.println("Object 1 = "+person);
		
		Person person1 = new Person(); 
		person1.setName("Marimuthu R");
		person1.setAge(40);
		person1.setEmpId(220503);
		person1.setNativeplace("Singanallur");
		
		System.out.println("Object 2 = "+person1);
		
		Person person2 = new Person(); 
		person2.setName("Marimuthu R");
		person2.setAge(40);
		person2.setEmpId(220503);
		person2.setNativeplace("Singanallur");
		
		System.out.println("Object 3 = "+person2);
		
			
		hashset.add(person);
		hashset.add(person1);
		hashset.add(person2);
		
		
		Iterator itr = hashset.iterator();
		while(itr.hasNext()){
			Person obj= (Person)itr.next();
			
			System.out.println("Name =====>"+obj.getName());
			System.out.println("Age =====>"+obj.getAge());
			System.out.println("EmpId =====>"+obj.getEmpId());
			System.out.println("Nativeplace =====>"+obj.getNativeplace());
			
		}
		
		
		
		
		
		
	}

}
