package com.demo.core;

import java.util.HashMap;

public class RepetitionofChac {

	/*This program takes input string and find out the repeated charaters/letters 
	 * and print the count 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="AJKHGAHKHKHAKHGKHAKGHAKHUIHKSHD";
		printduplicateccts(s);
		
		
	}

	private static void printduplicateccts(String s) {
		// TODO Auto-generated method stub
	HashMap<Character,Integer> hm = new HashMap<>();
	
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		if(hm.containsKey(c))
		{
			hm.put(c, hm.get(c)+1);
		}
		else {
			hm.put(c, 1);
		}
	}
	System.out.println(hm);
	for(Character c:hm.keySet())
	{
		if(hm.get(c)>1)
		{
			System.out.println(c +" "+ hm.get(c));
		}
	}
	
		
		
	}

}
