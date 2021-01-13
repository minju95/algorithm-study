package codePlus.AGBasic1.dp;

import java.util.Scanner;

/*
 * 2021.01.12, 13
 * 14002번 - 가장 긴 증가하는 부분 수열4
*/
public class DP_14002 {
	static int [] numbers; 
	static int [] indexArr; //역추적에 활용할 배열 (각 dp의 값이 어떤 인덱스로 인해 변하는지 기록하는 용도)
	
	static void backTracking(int index) {
		System.out.println("indexArr["+index+"]= "+indexArr[index]);
		if(index == -1) return;
		backTracking(indexArr[index]);
		
		//index[5] -> index[3] -> index[1] -> index[0]
		
//		System.out.print(index+" ");
//		test
//		System.out.print("numbers["+index+"]= "+numbers[index]+" ");
//		System.out.print(numbers[index]+" ");
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		numbers = new int[n];
		for(int i=0; i<n; i++) {
			numbers[i] = scn.nextInt();
		}
		int [] dp = new int[n]; //증가하는 수열의 길이를 저장할 배열
		indexArr = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println();
			System.out.print("i의 값이 "+i+"일 때: ");
			System.out.println();
			dp[i] = 1; //증가하는 수열의 길이는 1로 설정
			indexArr[i]= -1;
			for(int j=0; j<i; j++) {
				if(numbers[j]<numbers[i] && dp[i]<dp[j]+1) {
					System.out.print("numbers["+j+"] < "+"numbers["+i+"] && dp["+i+"]("+dp[i]+") <"+"dp["+j+"]+1("+(dp[j]+1)+")");
					dp[i]=dp[j]+1;
		 			indexArr[i]=j; //조건문을 충족한 수열의 인덱스값 j를 index 배열에 저장
					System.out.println(" (j= "+j+"일 때) ");
					
				}
			}
			//index[] -> if문을 충족하지 않았으면 -1이 출력
			System.out.println(indexArr[i]+" ");
		}
		//     dp [] = [ 1, 2,  1, 3, 2, 4]   
		//indexArr[] = [-1, 0, -1, 1, 0, 3]
		System.out.println();
		int answer = dp[0]; //궁극적으로 구해야 하는 answer = dp[] 내에서 가장 큰 값
		int index = 0;
		for(int i=0; i<dp.length; i++) {
			if(answer<dp[i]) {
				answer = dp[i];
				index = i; //해당 LIS값의 인덱스를 구함 (5가 맨 처음)
			}
		}
		System.out.println("answer = "+answer);
		backTracking(index);
		System.out.println();
	}
}
