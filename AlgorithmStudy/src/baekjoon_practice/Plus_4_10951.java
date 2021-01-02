package baekjoon_practice;

import java.util.Scanner;

public class Plus_4_10951 {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner scn = new Scanner(System.in);
		while(scn.hasNextInt()) {
			a = scn.nextInt();
			b = scn.nextInt();
			System.out.println(a+b);
		}
		scn.close();
	}

}
