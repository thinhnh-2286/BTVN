package date1;

import java.util.Scanner;

public class Check_date {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int date;
		int month;
		int year;
		System.out.println("Pleases input value of year::");
		year = kb.nextInt();
		if ((year % 4 == 0) || (year % 400 == 0)) { // Năm nhuận
			System.out.println("Pleases input value of month:");
			month = kb.nextInt();
			System.out.println("Pleases input value of date:");
			date = kb.nextInt();
			if (month == 2) {
				if (date > 29 || date < 0) {
					System.out.println("Ngày tháng k hợp lệ");
				} else
					System.out.println("Ngày tháng hợp lệ");

			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
					|| month == 12) {
				if (date > 31 || date < 0) {
					System.out.println("Ngày tháng k hợp lệ");

				} else
					System.out.println("Ngày tháng hợp lệ");
				if (month == 4 || month == 6 || month == 9 || month == 11) {
					if (date > 30 || date < 0) {
						System.out.println("Ngày tháng k hợp lệ");
					} else
						System.out.println("Ngày tháng hợp lệ");
				}
			}
		} else {
			System.out.println("Pleases input value of month:");
			month = kb.nextInt();
			System.out.println("Pleases input value of date:");
			date = kb.nextInt();
			if (month == 2) {
				if (date > 28 || date < 0) {
					System.out.println("Ngày tháng k hợp lệ");
				} else
					System.out.println("Ngày tháng hợp lệ");

			} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
					|| month == 12) {
				if (date > 31 || date < 0) {
					System.out.println("Ngày tháng k hợp lệ");
				} else
					System.out.println("Ngày tháng hợp lệ");

				if (month == 4 || month == 6 || month == 9 || month == 11) {
					if (date > 30 || date < 0) {
						System.out.println("Ngày tháng k hợp lệ");
					} else
						System.out.println("Ngày tháng hợp lệ");
				}
			}
		}
	}
}
