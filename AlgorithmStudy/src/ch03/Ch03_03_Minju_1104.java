package ch03;
import java.util.*;

public class Ch03_03_Minju_1104 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("행과 열의 개수를 입력하세요. -> ");
		
		int column = scn.nextInt(); //행
		int row = scn.nextInt(); //열
		int answer = 0;
		
		for(int i=0; i<column; i++) { //모든 행에서의 최댓값 뽑기
		int minNo = 10001;
		/*
		 * 1) minNo를 선언하는 이유?
		 * - 한 행내에서 각 숫자와 비교하여 최솟값을 구할 때의 기준점을 잡기 위해서
		 * 2) 왜 하필 바깥 for문에서 minNo를 선언하는가?
		 * - 각 행에서 minNo를 비교하여 최댓값을 찾으려면 바깥 for문에서도 minNo를 사용해야 하므로
		 * */
			for(int j=0; j<row; j++) { //한 행 내에서 모든 열에 해당하는 값 입력받기
				
				int number = scn.nextInt();
				minNo = Math.min(minNo, number); //한 행 내에서의 최솟값 구하기
			}
		//가장 작은 수들 중에서 가장 큰 수 찾기
		answer = Math.max(answer, minNo);
		
		}
		System.out.println("정답은? "+answer);
		
	}

}
