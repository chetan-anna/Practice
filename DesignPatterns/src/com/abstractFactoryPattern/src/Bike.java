package com.abstractFactoryPattern.src;

public class Bike {
	
	HandleBars handleBars;
	Pedal pedals;
	Tyre frontTyre;
	Tyre backTyre;
	
	
	public Bike(HandleBars handleBars,Pedal pedals,Tyre frontTyre,Tyre backTyre) {
		
		this.handleBars=handleBars;
		this.pedals=pedals;
		this.frontTyre=frontTyre;
		this.backTyre=backTyre;
		
	}


	public HandleBars getHandleBars() {
		return handleBars;
	}


	public Pedal getPedals() {
		return pedals;
	}


	public Tyre getFrontTyre() {
		return frontTyre;
	}


	public Tyre getBackTyre() {
		return backTyre;
	}
	
	  @Override
	public String toString(){
		return "handleBars = "+handleBars.getType()+" Pedals ="+pedals.getType()+" FronTyre ="+frontTyre.getType()+" BackTyre ="+backTyre.getType();
    	 
    	 
    	 
     }
}
