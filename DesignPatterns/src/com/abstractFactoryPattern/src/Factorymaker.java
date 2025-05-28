package com.abstractFactoryPattern.src;

import java.util.HashMap;
import java.util.function.Supplier;

public class Factorymaker {
	
	
	public static final HashMap <String, Supplier<BikeFactory>> bikeTypes=new HashMap<String, Supplier<BikeFactory>>();
	
	static
	
	{
		bikeTypes.put("ROAD", roadFactory::new);
		bikeTypes.put("MOUNTAIN", mountainFactory::new);
	}

	
	
	public static BikeFactory creatFactory(String bikeType) {
		
		if (bikeTypes.get(bikeType)!=null) {
			return bikeTypes.get(bikeType).get();
		}
		else {
			throw new IllegalArgumentException("Bike type is not supported");
		}
		
		
	}

}
