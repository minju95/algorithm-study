package codePlus.AGBasic2.BruteForce;
import java.util.*;
/*
 * 2021.02.01
 * 1107번 - 리모컨 문제
*/
public class No_1107 {
	
	
	static boolean[] broken = new boolean[10];
	static int possible(int currentCh) {
		if(currentCh == 0) { //현재 채널이 0번일 때
			if(broken[0]) return 0; //0번 버튼이 고장난 경우, 0을 리턴하고 possible 메소드 종료
			else return 1; //0번은 고장이 나지 않았으므로 0번 버튼을 1회 누르고 종료 
		} 
		
		int numberLength = 0;
		while(currentCh>0) {
			if(broken[currentCh%10]) { //cuurentCh의 자리 수중 하나가 고장난 버튼이라면
				return 0; //고장난 버튼을 사용할 순 없으니 바로 0을 리턴하고 possible 메소드 종료
			}
			numberLength++;
			currentCh /=10;
		}
		return numberLength;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		for(int i=0; i<m; i++) {
			broken[scn.nextInt()]= true;
		}
		
		//정답의 초기값 (예외)
		int minLength = Math.abs(n-100); // 숫자버튼을 누르지 않는 경우 (모든 경우 가능)
		//e.g. 101번 채널로 이동하고 싶으면, 100번 채널에서 + 1회만 누르면 됨
		
		
		for(int i=0; i<=1000000; i++) {
			int currentCh = i;
			int numberLength = possible(currentCh);
			if(numberLength>0) {
				int symbolLength = Math.abs(n-currentCh);
				minLength = Math.min(minLength, numberLength+symbolLength);
			} 
		}
		System.out.println(minLength);
	}
}
