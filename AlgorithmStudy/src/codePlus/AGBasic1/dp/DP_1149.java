package codePlus.AGBasic1.dp;
import java.util.*;

public class DP_1149 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][] price = new int[n+1][3];
		
		//가격 집어넣기
		for(int i=1; i<=n; i++) {
			for(int j=0; j<3; j++) {
				price[i][j]= sc.nextInt();
			}
		}
		int [][] dp = new int[n+1][3];
		for(int i=1; i<=n; i++) {
			dp[i][0]= Math.min(dp[i-1][1],dp[i-1][2])+price[i][0];
			dp[i][1]= Math.min(dp[i-1][0],dp[i-1][2])+price[i][1];
			dp[i][2]= Math.min(dp[i-1][0],dp[i-1][1])+price[i][2];
		}
		//dp[i][0], do[i][1], dp[i][2] 값 모두를 비교하여 최솟값 출력
		System.out.println(Math.min(  Math.min(dp[n][0], dp[n][1]),   dp[n][2]) );
		
	}
	
	
}
