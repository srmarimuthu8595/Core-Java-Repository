package com.srm.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.srm.collections.pojos.Person;

public class ArrayListSychronization {
	
public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		//Collections.synchronizedList(list);
		
		
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println("Array List Values ======>"+itr.next());
			
			System.currentTimeMillis();
		}
		
		for(String str:list){
			System.out.println("Enhanced for Values ============>"+str);
		}
		
		for (int i=0;i<list.size();i++){
			System.out.println("Normal forloop Values ============>"+list.get(i));
		}
		
		System.out.println(" Timing =========>"+System.currentTimeMillis());
		
		List<Person> personList = new ArrayList<Person>();
		
		Person person1 = new Person();
		person1.setName("Marimuthu R");
		person1.setAge(40);
		person1.setNativeplace("Singanallur");
		
		Person person2 = new Person();
		person2.setName("Rakkanagounder");
		person2.setAge(70);
		person2.setNativeplace("Singanallur");
		
		Person person3 = new Person();
		person3.setName("Chinnasamy");
		person3.setAge(40);
		person3.setNativeplace("Erode");
		
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		
		Iterator itr1 = personList.iterator();
		while(itr1.hasNext()){
			Person person =(Person)itr1.next();
			
			System.out.println("Person Name  ======>"+person.getName());
			System.out.println("Person Age  ======>"+person.getAge());
			System.out.println("Person Native  ======>"+person.getNativeplace());
			
			System.currentTimeMillis();
		}
		
		
	}
	
	

}
