package l1;

import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter litter: ");
		String litter = sc.next();
		
	
		do {
			System.out.println("Enter other litter: ");
		}
			while ( litter == 'q' );
		break;

	}

}
