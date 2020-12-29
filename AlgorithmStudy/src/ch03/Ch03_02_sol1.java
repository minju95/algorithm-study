package ch03;

import java.util.Scanner;
import java.util.Arrays;

public class Ch03_02_sol1 {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in); 
		int N; //배열의 크기
		int M; //숫자가 더해지는 횟수
		int K; //한 번에 최대로 더할 수 있는 횟수 
		
		
		
		System.out.print("숫자를 입력하세요. -> ");
		
		// N, M, K 입력받기
		//공백 분리: nextInt();
		N = scn.nextInt(); 
		M = scn.nextInt(); 
		K = scn.nextInt(); 
		
		// N개의 숫자 입력받기
		int arr[] = new int[N];
		System.out.print(N+"개만큼의 숫자를 입력하세요. -> ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		Arrays.sort(arr); //오름차순으로 배열 정렬
		
		System.out.print("오름차순으로 정렬된 배열 출력해보기: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("================");
		
		int first = arr[N-1]; //배열에서 제일 큰 수
		int second = arr[N-2]; //배열에서 두 번째로 큰 수 
		
		int result = 0; //더해서 나오는 값
		
		
		while(true) {
			for(int i=0; i<K; i++) { //한 번에 최대로 더할 수 있는 횟수 
				if(M==0) break; //숫자가 더해지는 횟수
				result += first;
				M-=1;
			}
			if(M==0) break;
			result += second;
			M -= 1;
		}
		
		System.out.println("최종 답안: "+result);
	}
	
}
