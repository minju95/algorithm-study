package ch03;

import java.util.*;
class Ch03_03_Minju2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("숫자 입력 (행 개수, 열 개수) -> ");
		
		//N,M을 공백을 기준으로 구분하여 입력받기
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		int result = 0;
		
		//한 줄씩 입력받아 확인하기
		for(int i=0; i<n; i++) {
			//현재 행 중에서 가장 작은 수 찾기
			int min_value = 10001;
			for(int j=0; j<m; j++) {
				int x = scn.nextInt();
				min_value = Math.min(min_value, x);
			}
		//가장 작은 수들 중에서 가장 큰 수 찾기
		result = Math.max(result, min_value);
		}
		
		System.out.println(result);
	}
}
