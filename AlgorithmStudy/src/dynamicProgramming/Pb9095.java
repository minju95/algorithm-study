package dynamicProgramming;

import java.util.Scanner;

public class Pb9095 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        
        System.out.println(fibo(a));
 
    }
    
    static int fibo(int a){
        if (a==1||a==0) return 1; 
        return fibo(a-1)+fibo(a-2);
    }

}
