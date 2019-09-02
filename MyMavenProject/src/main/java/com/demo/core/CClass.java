package com.demo.core;

/* Rules
 * 1. Parent and child class method signature should be same.
 * 2. Overridden and overriding methods return type must be same at Primitive level.
 * Return type can be different/Changes at class level.
 * 3. Static and Final Method overriding not possible(You can extend and over ride but 
 * it will call the Parent class method always and not overridden method.ed 
 * 4. If a class declared as Final, It can not be extended as well as overridden.
 * 5. If the variable is declared as Final it ca not be modified.
 */

class AClass {

	public static void m1() {
		// TODO Auto-generated method stub
System.out.println("M1 from A Class");
	}
	
	public void m2() {
		System.out.println(" Method 2 in A Class");
	}

}
class BClass extends AClass{
	
	
	public static void m1() {
		System.out.println(" M1 from Child B Class");
	}
	
	public void m2()
	{
		System.out.println("M2 method in B Class");
		System.out.println("****");
		super.m2();
	}

}
class CClass{
	
	public static void main(String args[])
	{
		AClass p = new BClass();
		BClass c=new BClass();
		AClass a=new AClass();
		p.m1();
		c.m1();
		a.m1();
		a.m2();
		System.out.println("---------------------");
		p.m2();
		
		
	}
	public void callmethod()
	{
		
	}
}