package codePlus.AGBasic2.BruteForce;

import java.util.Scanner;

public class No_3085_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		char [][] arr = new char [n][n];
		int max = 0;

		for(int i=0; i<n; i++) {
			arr[i] = scn.next().toCharArray();
//			System.out.println(arr[i]);

			//toCharArray() : 문자열을 char형 배열로 바꾸어줌
		}
	}
	
}
