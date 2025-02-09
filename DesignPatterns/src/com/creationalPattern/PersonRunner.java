package com.creationalPattern;

import com.creationalPattern.Person.PersonBuilder;

public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		Person per=new PersonBuilder("john","cano").email("testpatern@gmail.com").middleName("duno").phonenumber("1234567890").build();
		System.out.println(per);
	}

}
