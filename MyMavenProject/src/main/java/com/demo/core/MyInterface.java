package com.demo.core;

public interface MyInterface {
	
	/* Interface:
	 * 1. Interface is 100 % Abstract: This has been changed after the Java 8 version
	 * 2. We can not create Object of an Interface
	 * 3. We can declare method signature in Interface
	 * 4. Methods and variables are by default public and static
	 * 5. default and static can be the type of methods and variables
	 * 6. default methods are implicitly public
	 * 7. default method you can implement inside an interface
	 * 8. static method you can call by Interface.method name
	 * 
	 * 
	 */
	
	public static void add() {}
	public void delete();
	void create();
	abstract void update();
	public default void set(String x,String y) {}
	default void get(String x, String y) {
		System.out.println("Checking Properties");
	}
	public static void printSomething() {
		System.out.println("Checking Implementing something In Java Interface");
	}
	int X=10;
	public String name = "Shrikant";
	
	
}

