package codePlus.AGBasic1.dp;
import java.util.*;

/*
 * 2021.01.13
 * 1699번 - 제곱수의 합
*/
public class DP_1699 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int dp[] = new int[n+1]; //최소 개수를 저장할 배열 변수
		//dp[n] = n을 제곱수들의 합으로 표현할 때 그 항의 최소 개수
		
		for(int k=0; k<dp.length; k++) {
			dp[k]=k;
			System.out.print(dp[k]+" ");
		}
		System.out.println();
		
		for(int i=1; i<=n; i++) {
		//dp[i]는 n을 넘길 수 없음 -> why? dp[i]= (1의 제곱)*n개 일 수 있으므로
			for(int j=1; j*j<=i; j++) { //제곱수(j*j)는 n보다 클 수는 없다는 문제의 조건을 기억할 것
				System.out.println("i= "+i+", j= "+j);
				System.out.println("dp[i]= "+dp[i]);
				System.out.println("dp[j]+1= "+ (dp[i-j*j]+1));
				
				dp[i]=Math.min(dp[i], dp[i-j*j]+1);
				//dp[i]
				//dp[i-1]+1, dp[i-4]+1, dp[i-9]+1,...
				
			}
			
			//출력용
			for(int k=0; k<dp.length; k++) {
				System.out.print(dp[k]+" ");
			}
			System.out.println("");
		}
		System.out.println("=========");
		for(int i=0;i<dp.length; i++) {
			System.out.print(dp[i]+" ");
		}
		System.out.println();
		System.out.println("항의 최소 개수= "+dp[n]);
	}
}
