package com.demo.core;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number to Check");
		int x=sc.nextInt();
		FindPrime(x);

	}

	private static void FindPrime(int x) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<x;i++)
		{
			if((x%i)==0)
			{
				System.out.println("Is Not a Prime Number");
			}
		}
	}

}
