package codePlus.AGBasic1.dp;
import java.util.*;

public class DP_15988 {
	/*
	 * 2021.01.22
	 * 15988번 - 1, 2, 3 더하기 3 (실버 2)
	*/
	static int dp[] = new int[1000001];

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int testCase = scn.nextInt();
		solution();
		
		while(testCase>=0) {
			int number = scn.nextInt();
			int answer = dp[number] % 1000000009;
			System.out.println(answer);
			testCase--;
			if(testCase==0) break;
		}
	
	}
	static void solution() {
		dp[0]=1;
		dp[1]=1;
		dp[2]=2; // 1+1, 2
		dp[3]=4; // 1+1+1, 2+1, 1+2, 3
		
		for(int i=4; i<dp.length; i++) {
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		}
	}

}
