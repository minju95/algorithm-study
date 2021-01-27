package codePlus.AGBasic2.BruteForce;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 2021.01.27
 * 2309번 - 일곱난쟁이
*/
public class No_2309 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int [] height = new int[9];
		int sum = 0;
		for(int i=0; i<height.length; i++) {
			height[i] = scn.nextInt();
			sum += height[i];
		}
		Arrays.sort(height);
		
		for(int i=0; i<height.length; i++) {
			for(int j=i+1; j<height.length; j++) {
				if(sum-height[i]-height[j]==100) {
					for(int k=0; k<height.length; k++) {
						if( i==k || j== k ) 
							continue;
							System.out.println(height[k]);
					}
					System.exit(0); // 프로그램 종료 (강제로 JVM 종료)
				}
			}
		}
		
		
	}
}

