package codePlus.AGBasic1.basics;

import java.util.Scanner;

public class Plus_8_11022 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int test = scn.nextInt();
		int count = 1;
		while(test-- >0) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			System.out.println("Case #"+count+": "+a+" + "+b+" = "+(a+b));
			count++;
		}

	}

}
