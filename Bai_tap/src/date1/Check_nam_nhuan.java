package date1;

import java.util.Scanner;

public class Check_nam_nhuan {

	public static void main(String[] args) {
		int year;
		Scanner kb = new Scanner(System.in);
		System.out.println("Pleases input value of year::");
		year = kb.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year");
				} else {
					System.out.println(year + " is NOT a leap year");
				}
			} else {
				System.out.println(year + " is a leap year");
			}
		} else {
			System.out.println(year + " is NOT a leap year");
		}

	}

}
