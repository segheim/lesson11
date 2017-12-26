package l1;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		
		int sum = 0;
		int max = 0;
		int min = 0;

		Scanner sc1 = new Scanner(System.in);
		System.out.print(" Enter first number: ");
		int a = sc1.nextInt();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print(" Enter second number: ");
		int b = sc2.nextInt();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.print(" Enter third number: ");
		int c = sc3.nextInt();
		
		if ( a > b & a > c) {
			System.out.println("big" + a);
		max = a;
		}
		if ( b > a & b > c) {
			System.out.println("big" + b);
		max = b;
		}
		if ( c > a & c > b) {
			System.out.println("big" + c);
		max = c;
		}
		if ( a < b & a < c) {
			min = a;
		}
		if ( b < a & b < c) {
			min = b;
		}
		if ( c < a & c < b) {
			min = c;
		}
		
		sum = max + min;
		System.out.println("Sum numbers = " + sum);
	}

}
