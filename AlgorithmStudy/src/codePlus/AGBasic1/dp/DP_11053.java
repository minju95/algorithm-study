package codePlus.AGBasic1.dp;

import java.util.Scanner;

/*
 * 2021.01.12
 * 11053번 - 가장 긴 증가하는 부분 수열
*/
public class DP_11053 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int numbers[] = new int[n];
		for(int i=0; i<numbers.length; i++) {
			numbers[i]= scn.nextInt();
		}
		System.out.println();
		int[] dp = new int [n];
		
		for(int i=0; i<n; i++) {
			dp[i]=1;
			for(int j=0; j<i; j++) {
				if(numbers[j]<numbers[i] && dp[i]<dp[j]+1) {
				// 마지막 수보다 앞에 위치한 수 < 마지막 수보다 작은 경우  && dp[마지막 수] < dp[마지막수보다 앞에 위치한 수]+1
					dp[i] = dp[j]+1; //dp[j] = 마지막 수보다 작은 수들의 LIS 중 크기가 가장 큰 것
				}
			}
			System.out.print(dp[i]+" ");
		}
		System.out.println();
		int answer = dp[0];
		for(int i=0; i<n; i++) {
			if(answer<dp[i]) { //dp배열 안에 삽입된 수가 answer보다 큰 경우를 만나면
				answer = dp[i]; //해당 수로 answer를 변경해줌
			}
		}
		System.out.println("answer= "+answer);
		}
}	
