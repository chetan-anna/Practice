package com.abstractFactoryPattern.src;

public interface BikeFactory {
	HandleBars createHandleBars();
	Pedal createPedal();
	Tyre createTyre();

}
