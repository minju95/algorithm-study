package codePlus.AGBasic2.BruteForce;
import java.util.*;
/*
 * 2021.02.10
 * 1748번 - 수 이어쓰기1
*/
public class No_1748 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		long answer = 0; //n의 자릿수
		
		for(int start = 1, length =1; start<=n; start*=10, length++) { //length = 자릿수
			int end = start*10-1; //9, 99, 999, 999...
			if(end > n) {
				end = n;
			}
			answer += (end-start+1)*length; //한자리수 일때의 개수 + 2자리수일때의 개수 +...
			System.out.println(answer);
		}
		System.out.println(answer);
  		
	}
}
