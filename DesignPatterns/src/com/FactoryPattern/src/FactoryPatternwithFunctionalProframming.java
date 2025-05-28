package com.FactoryPattern.src;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FactoryPatternwithFunctionalProframming {

	public static final Map<String,Supplier<Snack>> snackType=new HashMap<String, Supplier<Snack>>();
	public static void main(String[] args) {
		
		Snack juice = snackFactory("Juice");
		 System.out.println( "Juice price is "+juice.getPrice());
		 
		 Snack Biscuits = snackFactory("Biscuits");
		 System.out.println( "Biscuits price is "+Biscuits.getPrice());
		  		
	}
	 
	static {
		
		snackType.put("Juice", Juice::new);
		snackType.put("Biscuits", Biscuits::new);
	}
	
	
	   static  Snack snackFactory(String Type){
	    	
	    	
	    	if(snackType.get(Type)!=null)
	    		return snackType.get(Type).get();
	    	else
	    		throw new IllegalArgumentException("Snack Type is not present");
	    	  	
	    	
	    	
	    }
	
}
