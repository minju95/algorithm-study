package ch03;
import java.util.*;

public class Ch03_04_Minju {
	public static void main(String[] args)  {
		Scanner scn = new Scanner(System.in);
		System.out.println("n과 k를 각각 입력하세요. ");
		int n = scn.nextInt();
		int k = scn.nextInt();
		int count = 0;
		int x;
		
		if(n%k == 0) {
			x = n/k;
			count++;
			if(x != 1) {
				
			}
		} else {
			x = n-1;
			
		}
		
		
	}
}
