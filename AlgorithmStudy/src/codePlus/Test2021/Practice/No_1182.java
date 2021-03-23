package codePlus.Test2021.Practice;
import java.util.*;
public class No_1182 {
	static int answer = 0;
	static void solve(int[] arr, int s, int index, int sum) {
		if(index == arr.length) { //수열의 처음부터 끝까지 훑으면서 부분수열에 포함할지 결정한 경우
			System.out.println(index+" -> index랑 arr.length랑 동일");
			System.out.println(sum+"-> sum값");
			if(sum == s) { //지금까지 더한 수가 입력으로 주어진 s와 동일하다면
				answer += 1;
				System.out.println("sum= "+sum+", answer = "+answer);
			}
			return;
		}
		System.out.println("선택o 메소드 지나기 전"+(index+1));
		solve(arr, s, index+1, sum+arr[index]);
		
		//첫번째 solve()를 돌면 여기 밑으로 안 내려감 
		System.out.println("원래 index = "+index);  
		System.out.println(index+1);
		solve(arr, s, index+1, sum);
		System.out.println("선택x 메소드를 거쳤음");
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int s = scn.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		
		solve(arr, s, 0, 0);
		if (s==0) { //크기가 0인 부분수열을 구하는 경우면
			System.out.println("y");
			answer -= 1;
		}
		
		System.out.println(answer);
	}

}
