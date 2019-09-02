package com.demo.core;

public class StringOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "The Value of this word and its length check";
		String[] words=s.split(" ");
		System.out.println(words.toString());
		for(String singles:words){
			System.out.println(singles);
		}
	}

}
