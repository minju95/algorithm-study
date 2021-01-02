package baekjoon_practice;

import java.util.Scanner;

public class Plus_6_10953 {
	static int t;
	static String line;
	static String[] arr;
	
	
	static int left;
	static int right;
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		t = scn.nextInt();
		scn.nextLine();
		
		while(t>0) {
			line = scn.nextLine();
			arr = line.split(",");
			left = Integer.parseInt(arr[0]);
			right = Integer.parseInt(arr[1]);
			System.out.println(left+right);
			t--;
		}
	}
}
