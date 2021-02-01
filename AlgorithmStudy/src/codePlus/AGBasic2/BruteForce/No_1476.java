package codePlus.AGBasic2.BruteForce;
import java.util.*;

public class No_1476 {
	public static void main(String[] args) {
		//전체 경우의 수 = 15*28*19=7980
		Scanner scn = new Scanner(System.in);
		
		int E = scn.nextInt();
		int S = scn.nextInt();
		int M = scn.nextInt();
		
		int e=1, s=1, m=1;
		
		for(int i=1;; i++) {
			if(e==E && s==S && m==M) {
				System.out.println(i);
				break;
			}
			
			//e,s,m 모두 한꺼번에 1증가
			e++;
			s++;
			m++;
		
			if(e==16) {
				e=1;
			}
			if(s==29) {
				s=1;
			}
			if(m==20) {
				m=1;
			}
		
		}
	}
}
