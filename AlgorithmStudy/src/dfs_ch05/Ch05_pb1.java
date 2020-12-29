package dfs_ch05;

import java.util.*;
public class Ch05_pb1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("행(N)과 열(M)의 수를 각각 입력하세요. ");
		int row = scn.nextInt();
		int col = scn.nextInt();
		
		int [][] arr = new int [row][col];
		
		System.out.println("얼음틀을 입력하세요.");
		int row1 = scn.nextInt();
		int row2 = scn.nextInt();
		int row3 = scn.nextInt();
		int row4 = scn.nextInt();
	
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]==0) {
					//arr[i][j+1]
				}
			}
		}
	}

}


