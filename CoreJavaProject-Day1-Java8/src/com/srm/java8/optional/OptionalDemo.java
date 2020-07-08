package com.srm.java8.optional;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {   
        String[] words = new String[2]; 
        //String[] words = {"State Bank of India","Kavunthapadi","Erode"};
        Optional<String> checkNull =  
                      Optional.ofNullable(words[1]);   
        if (checkNull.isPresent()) {   
            String word = words[1].toLowerCase();   
            System.out.print(word);   
        } else  
            System.out.println("word is null");   
    }   

}
