package com.abstractFactoryPattern.src;

public class BikeManfacturerwithFactoryMaker {
	
	public static void main(String[] args) {
		
		
		Bike roadBike=buildBike("ROAD");
		Bike mountainBike=buildBike("MOUNTAIN");
		System.out.println(roadBike);
		System.out.println(mountainBike);
	}
	
	
	      private static Bike buildBike(String bikeType) {

				BikeFactory bikefactory=Factorymaker.creatFactory(bikeType);
				var roadHandlers=bikefactory.createHandleBars();
				var roadPedal=bikefactory.createPedal();
				var frontTyre=bikefactory.createTyre();
				var backTyre=bikefactory.createTyre();
				return new Bike(roadHandlers, roadPedal, frontTyre, backTyre);
				
	    	  
	      }

}
