package com.recursion.practice;

public class Combinations{
	
	public static void main(String[] args){
		combination("ABC");
	}
	
	public static void combination(String word){
		printCombination("", word);
	}
	
	public static void printCombination(String prefix, String word){
		if(word.length() <= 1){
			System.out.println(prefix + word);
		}else{
			printCombination(prefix + word.charAt(0), word.substring(1));
			
			for(int i = 1; i <= word.length() - 2; i++){
				printCombination(prefix + word.charAt(i), word.substring(0, i) + word.substring(i + 1));
			}
			printCombination(prefix + word.charAt(word.length() - 1), word.substring(0, word.length() - 1));
		}
	}
	
}