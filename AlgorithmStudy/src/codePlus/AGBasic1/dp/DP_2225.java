package codePlus.AGBasic1.dp;

import java.util.Scanner;

public class DP_2225 {
	public static long mod = 1000000000L;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		long[][] dp = new long[k+1][n+1];
		for(int i=0; i<dp.length; i++) {
			dp[0][0] = 1;
		}
		
		for(int i=1; i<=k; i++) {
			for(int j=0; j<=n; j++) {
				for(int l=0; l<=j;l++) {
					dp[i][j]+=dp[i-1][j-1];
					dp[i][j]%=mod;
				}
			}
		}
		System.out.println(dp[k][n]);
	}
		
		
		
 	
}
