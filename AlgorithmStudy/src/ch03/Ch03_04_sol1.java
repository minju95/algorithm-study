package ch03;

import java.util.*;
public class Ch03_04_sol1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("n과 k를 각각 입력하세요 -> ");
		int n = scn.nextInt();
		int k = scn.nextInt();
		int count = 0;

		while(n>=k) { //n이 k보다 크거나 같을 동안에만 실시
			while(n%k!=0) {//n이 k로 나누어 떨어지지 않는다면
				n=n-1;
				count++;
			}
			n=n/k;
			count++;
		}
		
		while(n>1) { //마지막으로 남은 수에 대해  1씩 빼기
			n=n-1;
			count++;
		}
		
		System.out.println("최소 횟수? "+count+"회");

	}

}
