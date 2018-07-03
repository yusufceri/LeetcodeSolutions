package com.example.leetcodesolution;

/*Write a function that takes a string as input and returns the string reversed. */
public class ReverseString {

	public static void main(String[] args) {
		String str = "Hello";

		System.out.println(reverseString(str));
	}

	public static String reverseString(String s) {
		int length = s.length();
		char[] reversed = new char[length];
		for(int i=length-1;i>=0;i--){
			reversed[length-i-1] = s.charAt(i);
		}
		return new String(reversed);
	}
}
