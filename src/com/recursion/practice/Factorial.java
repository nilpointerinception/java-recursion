package com.recursion.practice;

public class Factorial{
	public static void main(String[] args){
		System.out.println(factorial(7));
		System.out.println(factorial(10));
	}
	public static int factorial(int x){
		return (x == 1) ? 1 : x * factorial(x - 1);
	}
}
