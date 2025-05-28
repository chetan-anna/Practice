package com.FactoryPattern.src;

public class FactoryPattern {

	
	public static void main(String[] args) {
		
		Snack juice = snackFactory("Juice");
		 System.out.println( "Juice price is "+juice.getPrice());
		 
		 Snack Biscuits = snackFactory("Biscuits");
		 System.out.println( "Biscuits price is "+Biscuits.getPrice());
		  
		
	}
	 
	
	
	
	   static  Snack snackFactory(String snackType){
	    	
	    	
	    	if(snackType.equals("Juice"))
	    		return new Juice();
	    	else
	    		return new Biscuits();    	
	    	
	    	
	    }
	
}
