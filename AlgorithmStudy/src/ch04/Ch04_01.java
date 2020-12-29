package ch04;

import java.util.Scanner;

public class Ch04_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("정사각형의 크기를 입력하세요: ");
		int n = scn.nextInt();
		int [][]arr = new int[n][n];
		
		System.out.print("루트를 입력하세요: ");
		//next(): 문자/문자열을 공백을 기준으로 한 단어씩 입력받음
		
		
		String route1 = scn.next();
		String route2 = scn.next();
		String route3 = scn.next();
		String route4 = scn.next();
		String route5 = scn.next();
		String route6 = scn.next();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.println("arri["+i+"]"+"j["+j+"]"+arr[i][j]);
			}
		}
		
		int left;
		int right;
		int up;
		int down;
		
		
	}

}
