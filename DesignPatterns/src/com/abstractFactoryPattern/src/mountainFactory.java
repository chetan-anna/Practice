package com.abstractFactoryPattern.src;

public class mountainFactory implements BikeFactory {

	@Override
	public HandleBars createHandleBars() {
		// TODO Auto-generated method stub
		return new MountainHandleBars();
	}

	@Override
	public Pedal createPedal() {
		// TODO Auto-generated method stub
		return new MountainPedal();
	}

	@Override
	public Tyre createTyre() {
		// TODO Auto-generated method stub
		return new MountainTyre();
	}




}
