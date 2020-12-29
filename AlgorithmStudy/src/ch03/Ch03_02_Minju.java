package ch03;

import java.util.Scanner;
import java.util.Arrays;

public class Ch03_02_Minju {
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
		System.out.println("");
		
		int first = arr[N-1]; //배열에서 제일 큰 수
		int second = arr[N-2]; //배열에서 두 번째로 큰 수 
		int sum = 0;
		int count = 0; //더해지는 횟수를 M번까지 세는 변수
		
		//N: 배열의 크기, M: 숫자가 더해지는 횟수, K: 한번에 최대로 더할 수 있는 횟수
		while(count<K) {
			
			sum += first*K; //최댓값을 K번 곱함
			count += K;
			System.out.println("첫번째1: "+count);
			System.out.println("첫번째2: "+sum);
			if(count==M) break;
			
			sum+=second; //두번째로 큰수를 한 번만 더함
			count++; //count값을 1 증가
			System.out.println("두번째1: "+count);
			System.out.println("두번째2: "+sum);
			if(count==M) break;
			
		}
		
		System.out.println("마지막: "+sum);
		
		/*
		 * 문제 풀이에 실패한 이유 분석
		 * - 덧셈 순서가 k번만큼 곱셈-> 1번 덧셈 -> K번만큼 곱셈 -> 1번 덧셈 -> ...
		 * - 상기와 같은 줄 알았으나 애초에 K번만큼 바로 곱해버리면 추후에 문제가 발생한다
		 * 왜?
		 * - K번 만큼 바로 곱해버리면 M번 가까이 덧셈을 하였을 때 정확하게 M번만큼 더할 수 없기 때문이다.
		 * - 예를 들어, M이 7이라면
		 *   2(count=2) -> 1(count=3) -> 2(count=5) -> 1(count=6) -> 2(count=8)
		 * - 이렇게 되버리므로 count값(8)이 7인 M을 초과해버린다.
		 * - 따라서 이런 방식으로 코드를 작성할 것이 아니라(=K번 만큼 바로 곱하는 게 아니라)
		 * - 한 번에 최대로 더할 수 있는 K번까지 차례대로 count변수를 증가할 수 있도록 해야한다.
		 * */
	}
	
}
