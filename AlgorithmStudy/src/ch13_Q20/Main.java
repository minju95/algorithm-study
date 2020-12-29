package ch13_Q20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static int n;
	public static char[][] board = new char[6][6];
	public static ArrayList<ArrayList<Position>> teachers = new ArrayList<>(); //모든 선생님의 위치 정보
	public static ArrayList<ArrayList<Position>>  spaces = new ArrayList<>(); // 모든 빈 공간 위치 정보
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		
		//nxn크기만큼의 복도 생성 
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = scn.next().charAt(0);
				/*
				- 입력값을 String으로 간주한다면, next() 혹은 nextLine()
				- next() :공백전까지 입력받은 문자열(String)을 리턴
				- 입력값을 int로 간주한다면, nextInt()
				*/
				
				if(board[i][j]=='T') {
					// teachers.add(new Position(i, j));
				}
				
				if(board[i][j]=='X') {
					// spaces.add(new Position(i,j));
				}
			}
		}
		
		//빈 공간에서 3개를 뽑는 모든 조합을 확인
		Combination comb = new Combination(spaces.size(), 3);
		//comb.combination(spaces, 0, 0, 0);
		
	}
	
	//특정 방향으로 감시 진행
	/*
	 * public static boolean watch() {
	 * 
	 * }
	 * 
	 * //장애물 설치 이후 한 명의 학생이라도 감지되는지 검사 public static boolean process() {
	 * 
	 * }
	 */
	
	
	

}
