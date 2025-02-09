package com.creationalPattern;

public class Person {
	
	public String firstName;
	public String middleName;
	public String lastName;
	public String email;
	public String phonenumber;
	
	private Person(PersonBuilder personbuilder) {
		this.firstName=personbuilder.firstName;
		this.middleName=personbuilder.middleName;
		this.lastName=personbuilder.lastName;
		this.email=personbuilder.email;
		this.phonenumber=personbuilder.phonenumber;
	}

	@Override
	public String toString() {
		return firstName+" "+middleName+ " "+ lastName+" "+email+" "+phonenumber;	
		
	}
	
	public static class PersonBuilder {
		public String firstName;
		public String middleName;
		public String lastName;
		public String email;
		public String phonenumber;
		
		public PersonBuilder(String firstName,String lastName) {
			
			this.firstName=firstName;
			this.lastName=lastName;
		}
		public PersonBuilder middleName(String middleName) {
			
			this.middleName=middleName;
			return this;			
			
		}
       public PersonBuilder email(String email) {
			
			this.email=email;
			return this;			
			
		}
     public PersonBuilder phonenumber(String phonenumber) {
	
	   this.phonenumber=phonenumber;
	    return this;			
	
        }
		
		public Person build() {
			
			
			return new Person(this);
					
		}
	}
	

}
