import java.util.Scanner;

public class WhatX{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int x, res;
		
		System.out.print("x의 값은? ==> ");
		x = sc.nextInt();
		res = x * x * (3 * x - 7) + 9;
		System.out.println("3x^3 - 7x^2 + 9 = " + res);
	}
}