package com.recursion.practice;

public class GreatestCommonDenominator{
	public static void main(String[] args){
		System.out.println(gcd(50, 200));
	}
	
	public static int gcd(int a, int b){
		if(a == b){//a equals b
			return a;
		}else if(a == 1 || b == 1){//a or b equals 1
			return 1;
		}else if((a % 2 == 0)&&(b % 2 == 0)){//They are both even
			return 2 * gcd(a/2, b/2);
		}else if((a % 2 != 0)&&(b % 2 == 0)){//a is odd b is even
			return gcd(a, b/2);
		}else if((a % 2 == 0)&&(b % 2 != 0)){//a is even b is odd
			return gcd(a/2, b);
		}else{//Both odd
			return (a > b) ? gcd((a - b)/2, b) : gcd(a, (b - a)/2);
		}
	}
}
