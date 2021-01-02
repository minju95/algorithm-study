package baekjoon_practice;

import java.util.Scanner;

public class Plus_5_10952 {

	public static void main(String[] args) {
		int a;
		int b;
		
		Scanner scn = new Scanner(System.in);
		while(scn.hasNextInt()) {
			a = scn.nextInt();
			b = scn.nextInt();
			if(a==0 && b==0) {
				break;
			}
			System.out.println(a+b);
		}
		
	}
	
}
