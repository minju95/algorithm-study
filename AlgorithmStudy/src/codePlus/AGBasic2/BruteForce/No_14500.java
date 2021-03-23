package codePlus.AGBasic2.BruteForce;
import java.util.*;

public class No_14500 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); //세로 길이
		int m = scn.nextInt();
		int[][] input = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				input[i][j] = scn.nextInt();
			}
		}
		
		int answer = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				//모양을 먼저 지정해주고  if의 조건을 걸어주는 것
				
				
				//1. 현재시점을 기준으로 가로로 쭉 나열된 테트로미노 (하늘색)
				if(j+3<m) { //현재 시점에서 가로로 +3 < 가로 전체의 길이
 					int temp = input[i][j]+input[i][j+1]+input[i][j+2]+input[i][j+3];
 					answer = Math.max(answer, temp);
				}
				
				//2. 현재시점을 기준으로 세로로 쭉 나열된 테트로미노(하늘색)
				if(i+3<n) {
					int temp = input[i][j]+input[i+1][j]+input[i+2][j]+input[i+3][j];
					answer = Math.max(answer, temp);
				}
				
				
				
				//3. [주황색 1] 현재칸을 기준으로 밑으로 한 칸 더 존재, 오른족으로 2칸 더 존재하는 테트로미노 
				if(i+1<n && j+2<m) {
					int temp = input[i][j]+input[i+1][j]+input[i][j+1]+input[i][j+2];
					answer = Math.max(answer, temp);
				}
				
				/*4.  [주황색 2] 현재칸을 기준으로 밑으로 2칸 더 존재, 오른쪽으로 1칸 더 존재하는 테트로미노 ok
				/* OK
				 * 
				 * ㅁㅁ
				 * ㅁ
				 * ㅁ
				 * */
				if(i+2<n && j+1<m) {
					int temp =  input[i][j]+input[i+1][j]+input[i+2][j]+input[i][j+1];
					answer = Math.max(answer, temp);
				}
				
				/* 5. [주황색 3] 현재칸을 기준으로 오른쪽으로 2칸 더 존재, 맨 오른쪽 칸에서 밑으로 1칸 더 존재하는 테트로미노
				 * OK
				 * 
				 * ㅁㅁㅁ
 				 *    ㅁ
				 * */
				if(i+1<n && j+2<m) { //
					int temp =  input[i][j]+input[i][j+1]+input[i][j+2]+input[i+1][j+2];
					answer = Math.max(answer, temp);
				}
				
				/* 6. [주황색 4] 현재칸을 기준으로 밑으로 2칸 더 존재, 맨 밑칸에서 왼쪽으로 1칸 더 존재하는 테트로미노
				 * OK
				 *  
				 *  ㅁ
				 *  ㅁ
				 * ㅁㅁ
				 * */
				if(i+2<n && j-1>=0) { //
					int temp =  input[i][j]+input[i+1][j]+input[i+2][j]+input[i+2][j-1];
					answer = Math.max(answer, temp);
				}
				
				
				/* 7. [주황색 5] 현재칸을 기준으로 오른쪽으로 2칸 더 존재, 맨 오른쪽칸에서 위로 1칸 더 존재하는 테트로미노
				 * OK
				 * 
				 *    ㅁ
				 * ㅁㅁㅁ
				 * */
				if(i-1>=0 && j+2<m) {
					int temp =  input[i][j]+input[i][j+1]+input[i][j+2]+input[i-1][j+2];
					answer = Math.max(answer, temp);
				}
				
				/* 8. [주황색 6] 현재칸을 기준으로 밑으로 2칸 더 존재, 맨 밑칸에서 오른쪽으로 1칸 더 존재하는 테트로미노
				 * OK
				 *  
				 * ㅁ
				 * ㅁ
				 * ㅁㅁ
				 * */
				if(i+2<n && j+1<m) {
					int temp =  input[i][j]+input[i+1][j]+input[i+2][j]+input[i+2][j+1];
					answer = Math.max(answer, temp);
				}
				
				/* 9. [주황색 7] 현재칸을 기준으로 오른쪽으로 2칸 더 존재, 밑으로 1칸 더 존재하는 테트로미노
				 * OK
				 * 
				 * OOO
				 * O
				 * */
				if(i+1<n && j+2<m) {
					int temp =  input[i][j]+input[i][j+1]+input[i][j+2]+input[i+1][j];
					answer = Math.max(answer, temp);
				}
				
				/* 10. [주황색 8] 현재칸을 기준으로 오른쪽으로 1칸 더 존재, 그 오른쪽 칸 아래로 2칸으로 더 존재하는 테트로미노
				 * OK
				 * 
				 * OO
				 *  O
				 *  O 
				 * */
				if(i+2<n && j+1<m) {
					int temp =  input[i][j]+input[i][j+1]+input[i+1][j+1]+input[i+2][j+1];
					answer = Math.max(answer, temp);
				}
				
				/* 11.
				 * 
				 * OO
				 * OO
				 * */
				if(i+1<n && j+1<m) {
					int temp =  input[i][j]+input[i][j+1]+input[i+1][j]+input[i+1][j+1];
					answer = Math.max(answer, temp);
				}
				
				/* 12.
				 * 
				 *   OO
				 *  OO
				 * */
				if(i-1>=0 && j+2<m) {
					int temp =  input[i][j]+input[i][j+1]+input[i-1][j+1]+input[i-1][j+2];
					answer = Math.max(answer, temp);
				}
				
				/* 13.
				 * 
				 * O
				 * OO
				 *  O
				 * */
				if(i+2<n && j+1<m) {
					int temp =  input[i][j]+input[i+1][j]+input[i+1][j+1]+input[i+2][j+1];
					answer = Math.max(answer, temp);
				}
				
				
				/* 14.
				 * 
				 * OO
				 *  OO
				 * */
				if(i+1<n && j+2<m) {
					int temp =  input[i][j]+input[i][j+1]+input[i+1][j+1]+input[i+1][j+2];
					answer = Math.max(answer, temp);
				}
				/* 15.
				 * 
				 *  O 
				 * OO
				 * O
				 * */
				if(i+2<n && j-1>=0) {
					int temp =  input[i][j]+input[i+1][j]+input[i+1][j-1]+input[i+2][j-1];
					answer = Math.max(answer, temp);
				}
				
				if(j+2<m) {
					/*
					 * OOO
					 * */
					int temp = input[i][j]+input[i][j+1]+input[i][j+2]; 
					if(i-1>=0) {
						/*  O
						 * OOO
						 * */
						int temp2 = temp+input[i-1][j+1];
						answer = Math.max(answer, temp2);
					}
					if(i+1<n) {
						/*
						 * OOO
						 *  O
						 * */
						int temp2 = temp+input[i+1][j+1];
						answer = Math.max(answer, temp2);
					}
				}
				
				if(i+2<n) {
					/*
					 * O
					 * O
					 * O
					 * */
					int temp = input[i][j]+input[i+1][j]+input[i+2][j];
					/*  
					 * O
					 * OO
					 * O
					 * */
					if(j+1<m) {
						int temp2 = temp+input[i+1][j+1];
						answer = Math.max(answer, temp2);
					}
					
					
					/*
					 *  O
					 * OO
					 *  O
					 * 
					 * */
					if(j-1>=0) {
						int temp2 = temp + input[i+1][j-1];
						answer = Math.max(answer, temp2);
					}
				}
			}
		}
		System.out.println(answer);
	}
}
