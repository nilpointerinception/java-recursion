package com.recursion.practice;

public class Fibonacci{
	public static void main(String[] args){
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(14));
	}
	public static int fibonacci(int x){
		return (x > 1) ? fibonacci(x - 1) + fibonacci(x - 2) : x;
	}
}
