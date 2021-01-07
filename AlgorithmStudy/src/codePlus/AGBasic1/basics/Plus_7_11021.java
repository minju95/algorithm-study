package codePlus.AGBasic1.basics;

import java.util.Scanner;

public class Plus_7_11021 {

	public static void main(String[] args) {
		int t;
		Scanner scn = new Scanner(System.in);
		t = scn.nextInt();
		int cnt = 1;
		while(t>0) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			System.out.println("Case #"+cnt+": "+(a+b));
			cnt++;
			t--;
		}

	}

}
