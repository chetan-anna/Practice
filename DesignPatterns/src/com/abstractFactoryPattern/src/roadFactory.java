package com.abstractFactoryPattern.src;

public class roadFactory implements BikeFactory {

	@Override
	public HandleBars createHandleBars() {
		// TODO Auto-generated method stub
		return new RoadHandleBars();
	}

	@Override
	public Pedal createPedal() {
		// TODO Auto-generated method stub
		return new RoadPedal();
	}

	@Override
	public Tyre createTyre() {
		// TODO Auto-generated method stub
		return new RoadTyre();
	}




}
