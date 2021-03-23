package codePlus.AGBasic2.BruteForce;
import java.util.*;
public class No_1748_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int answer = 0; //n의 자릿수
		int n = scn.nextInt();
		int digit = 1; //자릿수
		int change = 10; //자릿수가 바쀨 때의 맨 처음 수(10, 100, 1000,...)
		
		for(int i=1; i<=n; i++) {
			if(i%change == 0) { //자릿수가 바뀌는 때이면
				digit++; //자릿수 증가
				change *= 10;
			}
			answer += digit;
		}
		System.out.println(answer);
	}
}
