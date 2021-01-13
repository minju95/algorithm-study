package codePlus.AGBasic1.dp;

import java.util.Scanner;

public class DP_11052 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt(); //구매하고자 하는 카드 개수
		int [] cardPack= new int[number+1]; //카드의 가격을 담기 위한 베열 (배열의 인덱스는 카드의 개수, 배열의 값은 카드팩의 가격)
		
		//카드팩의 가격들이 차례로 price 배열에 삽입됨
		for(int i=1; i<=number; i++) {
			cardPack[i]= scn.nextInt();
		}
		
		System.out.println();
		int maxPrice[] = new int[number+1]; //dp[]: N개의 카드를 구매할 때 금액의 최댓값을 저장
		//이 때 배열의 모든 값은 0으로 초기화
		
		//dp[0] = 카드를 0개 구매했을 때의 최댓값이므로 0
		for(int i=1; i<=number; i++) { //구매하고자 하는 카드 개수(i)만큼 돌리기
		//1개를 구매할 때부터 N개를 구매할 때까지
			System.out.println();
			System.out.println("구매하고자 하는 카드의 개수가 "+i+"개 일 때");
			for(int j=1; j<=i; j++) { //i개의 카드를 얻기 위해 가능한 모든 경우의 수 중 최댓값 찾기
				System.out.println("maxPrice["+i+"]= "+maxPrice[i]);
				System.out.println("maxPrice["+(i-j)+"]= "+maxPrice[i-j]+", cardPack["+j+"]= "+cardPack[j]);
				maxPrice[i] = Math.max(maxPrice[i], maxPrice[i-j]+cardPack[j]);
			}
		//d[] 배열에 값을 넣은 이후, 출력해보기
			for(int k=0; k<maxPrice.length; k++) {
				System.out.print(maxPrice[k]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("d배열의 최종 값");
		for(int i=0; i<maxPrice.length; i++) {
			System.out.print(maxPrice[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("카드"+number+"개를 갖기 위해 지불해야 하는 금액의 최댓값= "+maxPrice[number]);
	}
}
