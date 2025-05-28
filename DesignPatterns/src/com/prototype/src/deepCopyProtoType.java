package com.prototype.src;

public class deepCopyProtoType {
   public static void main(String[] args) {
	   
	   proto student=new Student("Chetan","address1Kurnool");
	   proto student1=student.clone();
	   ((Student)student1).address.setAddress("address2Hyderbad");
	  
	   
	System.out.println(student);
	System.out.println(student1);
}
}

interface proto{
	proto clone();
}

class Address{
	
	String address;
	Address(String address){
		
		this.address=address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	
	
}
  class Student implements proto,Cloneable{
	  Address address;
	  String name;
	  
	  Student(String name,String addrs1){
		  
		  this.name=name;
		  address=new Address(addrs1);
	  }
	  
	  
	  
	  @Override
	  public Student clone() {
		try {
			Student std1= (Student)super.clone();
			std1.address=new Address(this.address.getAddress());
			return std1;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			throw new AssertionError("Cloning not supported for Student class", e);
		}
		  
		  
		  
	  }
	  
	    public String toString(){
			return this.name+"  "+this.address.address;
	    	
	    	
	    }
	  
	  
	  
  }
