package codePlus.AGBasic1.dp;

import java.util.*;

public class DP_1463 {
    public static int[] d;
    public static int go(int n) {
        if (n == 1) {
        	System.out.println("0을 뱉어낸다.");
            return 0;
        }
        
        //맨 처음 숫자를 입력했을 땐 이 조건문 통과x -> why? 배열의 모든 값이 모두 0으로 초기화 되어 있음
        if (d[n] > 0) {
        	System.out.println("n="+n+", d[n]="+d[n]);
            return d[n];
        }
        
        //맨 처음 입력한 숫자가 여길 제일 먼저 들어가지
        d[n] = go(n-1) + 1;
        System.out.println("n="+n);
        System.out.println("d["+n+"]="+d[n]);
		/*
		 * for (int i : d) { System.out.print(d[i]+"-"); }
		 */
        
        for(int i=0; i<d.length; i++) {
        	System.out.print("d["+i+"]="+d[i]+" ");
        }
        System.out.println();
        //n=2
        if (n%2 == 0) { 
            int temp = go(n/2)+1;
            System.out.println(n+"temp= "+temp);
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        if (n%3 == 0) {
            int temp = go(n/3)+1;
            System.out.println("temp= "+temp);
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        return d[n];
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        d = new int[n+1]; //기본타입의 배열의 경우, 초기값 존재(int = 0, String = "")
        System.out.println("초기배열 상태");
		/*
		 * for (int i : d) { System.out.print(d[i]+" "+i); }
		 */
        for(int i=0; i<d.length; i++) {
        	System.out.print("d["+i+"]="+d[i]+" ");
        }
        
        System.out.println();
        System.out.println(go(n));
    }
}