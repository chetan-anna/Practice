package com.creationalPattern;

public class SingletonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Singleton obj1= Singleton.getInstance();
		obj1.print();
		
		SingletonSchronize obj2= SingletonSchronize.INSTANCE;
		obj2.print();

	}

}
