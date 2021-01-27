package codePlus.AGBasic1.dp;
import java.util.*;
public class DP_9095 {

/*
 * 2021.01.22
 * 9095번 - 1, 2, 3 더하기 (실버 3)
*/
	static int[] dp = new int[11]; //양수이면서 11보다 작음 (1~10)

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		dp[0]=1;
		
		solution();
		
		for(int i=0; i<tc; i++) { //테스트 케이스 횟수만큼 돌리기
			int number = scn.nextInt();
			System.out.println(dp[number]);
		}
	}
	
	public static void solution() {
		dp[1]=1; // 1
		dp[2]=2; //1+1, 2
		dp[3]=4; 
		for(int i=4;i<dp.length; i++) {
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		}
	}
}
