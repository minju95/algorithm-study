package ch03;
import java.util.*;
public class Ch03_02_sol2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N;
		int M;
		int K;
		
		System.out.print("N,M,K를 차례대로 입력하세요. ");
		
		N = scn.nextInt();
		M = scn.nextInt();
		K = scn.nextInt();
		
		int arr[] = new int[N];
		System.out.print(N+"개의 숫자만큼 입력하세요");
		for(int i=0; i<arr.length; i++) {
			arr[i]=scn.nextInt();
		}
		
		Arrays.sort(arr);
		int first = arr[N-1];
		int second = arr[N-2];
		
		// 가장 큰 수가 더해지는 횟수 계산
		int count = M/(K+1)*K; 
		/* M/(K+1) : 수열이 반복되는 횟수
		 * k : 한 수열 내에서 최대로 더해지는 횟수
		 */
		count += M%(K+1); //M이 K+1로 나누어 떨어지지 않았을 경우를 대비하여 이렇게 작성
		
		int result = 0;
		result += (count) * first; //가장 큰 수 더하기
		result += ( M - count) * second; //두번째로 큰 수 더하기
		
		System.out.println("합은? "+result);
		
		
		
	}
	
		

}
