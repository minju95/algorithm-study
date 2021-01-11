package codePlus.AGBasic1.data_structure1;

import java.util.Scanner;
import java.util.Stack;

public class Stack_9093 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		sc.nextLine();

		for(int m=0; m<testCase; m++) {
			String str = sc.nextLine();
			Stack<Character> stck = new Stack<Character>();
			StringBuilder sb = new StringBuilder();
//			System.out.println(str);
//			System.out.println(str.length());
			
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i) != ' ') { //문자를 만나면
					stck.push(str.charAt(i));
				} else if(str.charAt(i) == ' '){ //공백을 만나거나 개행문자를 만나면
					while(!stck.empty()) {
						sb.append(stck.pop());
					}
					sb.append(" ");
				
				}
			}
			
			while(!stck.empty()) {
				sb.append(stck.pop());
				
			}
			System.out.println(sb);
		}
		
		


	}
}
