package com.demo.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class FindRepetitionword {

	/*
	 * This Program takes input sentence and and print the repeated word with the
	 * number of counts
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the String or Sentence: ");
//		String mystring= input.next();
		String mystring = "The comb Honey bee produce honey in honey comb comb";
		findDuplicateWord(mystring);

	}

	private static void findDuplicateWord(String mystring) {
		// TODO Auto-generated method stub
		String[] totwords = mystring.split(" ");

		for (String s : totwords) {
			System.out.print(s + " ");
		}
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String string : totwords) {
			if (hm.get(string) != null) {

				hm.put(string, hm.get(string) + 1);

			} else {
				hm.put(string, 1);

			}
		}
		Iterator<String> tempword = hm.keySet().iterator();
		while (tempword.hasNext()) {
			String word = tempword.next();
			if (hm.get(word) > 1) {
				System.out.println();
				System.out.println(word + " " + hm.get(word));
			}

		}

	}

}
