package l1;

import java.util.Scanner;

public class task8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month: ");
		String a = sc.next();
		switch (a) {
		case "jenuary":
		case "february":
		case "december":
			System.out.print("Season: winter");
			break;
		case "march":
		case "april":
		case "may":
			System.out.print("Season: spring");
			break;
		case "june":
		case "july":
		case "augest":
			System.out.print("Season: summer");
			break;
		case "september":
		case "october":
		case "november":
			System.out.print("Season: autumn");
			break;
		}

	}

}
