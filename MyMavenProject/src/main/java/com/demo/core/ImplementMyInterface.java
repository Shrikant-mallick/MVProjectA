package com.demo.core;

public class ImplementMyInterface implements MyInterface{

	/* 1. A class use implement keyword to use Interface
	 * 2. A class can implements multiple interface
	 * 3. A class must implements all non implemented methods inside interface
	 * 4. Else compile time error will be displayed as "Add unimplemented methods" and 
	 * 5. make class as Abstract class
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println(" This is to delete the stuff");
		
	}

	public void create() {
		// TODO Auto-generated method stub
		System.out.println(" This is to Create a new stuff");
	}

	public void update() {
		// TODO Auto-generated method stub
		System.out.println(" This is to Update an existing stuff");
		
	}

	{
	MyInterface.add();

	}
}
