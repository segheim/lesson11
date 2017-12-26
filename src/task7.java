package l1;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbe -9 to 9: ");
		int a = sc.nextInt();
		
		if ( a%2 == 0) {
			if ( a > 0) {
				System.out.println("Positive even number!");
			}
		}
			
	}

}
