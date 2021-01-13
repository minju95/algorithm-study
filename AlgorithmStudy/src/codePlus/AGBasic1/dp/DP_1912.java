package codePlus.AGBasic1.dp;

import java.util.Scanner;

/*
 * 2021.01.13
 * 1912번 - 연속합
*/
public class DP_1912 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];
		for(int i=0; i<size; i++) {
			numbers[i]=sc.nextInt();
		}
	
		int max[] = new int[size];
		
		for(int i=0; i<size; i++) {
			max[i]=numbers[i];
			if(i==0) continue;
			if(max[i]<max[i-1]+numbers[i]) {
				max[i]=max[i-1]+numbers[i];
			}
			System.out.print(max[i]+" ");
		}
		System.out.println();
		int answer = max[0];
		for(int i=0; i<size; i++) {
			if(answer<max[i]) {
				answer = max[i];
			}
		}
		
		System.out.println("answer = "+answer);
	}
}
