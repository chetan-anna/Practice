package com.abstractFactoryPattern.src;

public class BikeManfacturer {
	
	public static void main(String[] args) {
		
		
		Bike roadBike=buildBike("Road");
		Bike mountainBike=buildBike("Mountain");
		System.out.println(roadBike);
		System.out.println(mountainBike);
	}
	
	
	      private static Bike buildBike(String bikeType) {
			if (bikeType.equals("Road")) {
				BikeFactory bikefactory=new roadFactory();
				var roadHandlers=bikefactory.createHandleBars();
				var roadPedal=bikefactory.createPedal();
				var frontTyre=bikefactory.createTyre();
				var backTyre=bikefactory.createTyre();
				return new Bike(roadHandlers, roadPedal, frontTyre, backTyre);
				
			} else {
				BikeFactory bikefactory=new mountainFactory();
				var roadHandlers=bikefactory.createHandleBars();
				var roadPedal=bikefactory.createPedal();
				var frontTyre=bikefactory.createTyre();
				var backTyre=bikefactory.createTyre();
				return new Bike(roadHandlers, roadPedal, frontTyre, backTyre);  
	    	  
			}  
	    	  
	      }

}
