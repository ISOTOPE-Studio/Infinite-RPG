package control;

import java.util.Scanner;

public class ExceptionList {

	public static int scannerInt() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b = -1;
		int a = -1;
		do {
			try {
				// System.out.println("fuck");
				b = -1;
				String s = sc.next();
				a = Integer.parseInt(s);
			} catch (Exception e) {
				System.out.println("输入错误，再试一次吧");
				b = 0;
			}
		} while (b == 0);
		return a;

	}

	// forString
	public static String scannerString(int n) {
		Scanner sc = new Scanner(System.in);
		String b;
		b = sc.next();
		while (b.length() > n) {
			System.out.println("名字长度要小于" + n + "位喔~再输入一次吧");
			b = sc.next();
		}
		return b;

	}

}
