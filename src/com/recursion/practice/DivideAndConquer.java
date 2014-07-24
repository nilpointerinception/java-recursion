package com.recursion.practice;

public class DivideAndConquer{
	
	public static String total = "";
	
	public static void main(String[] args){
		String s = reverse("lived");
		System.out.println(s);
		s = reverse("drawer");
		System.out.println(s);
		
		String i = reverse(12345);
		System.out.println(i);
	}
	
	public static String reverse(String word){
		if(word.length() <= 1) {
			return word;
		}
		return reverse(word.substring(1)) + word.charAt(0);
	}
	
	public static String reverse(int number){
		if(number < 10) {
			total += number;
			return total;
		} else {
			total += number % 10;
			return reverse(number / 10);
		}
	}
}
