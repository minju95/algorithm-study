package codePlus.AGBasic2.BruteForce;

import java.util.*;
public class No_3085 {
	static int n;
	static int max;
	static char [][] arr;
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		arr = new char [n][n];
		max = 0; //먹을 수 있는 사탕의 최대 개수

		for(int i=0; i<n; i++) {
			String str = scn.next();
			//for문 안에 있어야 하는 이유? 한 줄 씩 읽고, 문자열을 쪼개야 하므로
			//for문 밖에 있으면? n줄 중 첫 줄의 데이터만  배열에 반복적으로 입력됨
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=str.charAt(j);
//				System.out.print(arr[i]);
			}
//			System.out.println();
		}
		
		//오른쪽 칸의 사탕과 차례로 교환해보고 원위치로 되돌리기
		for(int i=0; i<n;i++) {
			for(int j=0; j<n-1;j++) {
				char temp = arr[i][j];
				arr[i][j] = arr[i][j+1];
				arr[i][j+1] = temp;
				maxCandies(); //오른쪽,아래쪽으로 쭉 훑으면서 사탕의 최대 갯수 구하기
				
				 
				
			}
		}
		
		//왼쪽 칸의 사탕과 차례로 교환해보고 원위치로 되돌리기
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				
				maxCandies(); //오른쪽,아래쪽으로 쭉 훑으면서 사탕의 최대갯수 구하기
			}
		}
		
	}
	
	
	public static int maxCandies() {
		int count = 1; //같은 색상의 사탕이 나오는 가장 긴 연속 부분 행/열의 "초기값"

		//오른쪽 칸과 비교하면서 먹을 수 있는 사탕의 최대 개수 구하기 (색상이 같다고 해서 사탕을 교환하진 x)
		for(int i=0; i<n; i++) { 
			for(int j=0; j<n-1; j++) {
				//arr[i][j] : 왼쪽칸, arr[i][j+1] : 오른쪽칸
				if(arr[i][j]==arr[i][j+1]) { // 오른쪽칸과 같은 색상의 사탕인 경우 -> 냠냠
					count++;
				} else { // 오른쪽칸과 다른 색상의 사탕인 경우
					count = 1;
				}
				max = Math.max(max, count); //먹을 수 있는 사탕의 최대개수를 저장
			}
		}
		
		count = 1; 
		//아래 칸과 비교하면서 먹을 수 있는 사탕의 최대 개수 구하기 (색상이 같다고 해서 사탕을 교환하진 x)
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-1; j++) {
				//arr[i][j] : 윗칸, arr[i+1][j] : 아래칸
				if(arr[i][j]==arr[i+1][j]) {
					count++;
				}
				else count = 1;
				max = Math.max(max, count);
			}
		}
		
		return max;
	}

}
