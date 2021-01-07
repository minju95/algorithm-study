package codePlus.AGBasic1.dataStructure1;

import java.util.Scanner;
import java.util.Stack;

public class Stack_17413 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		Stack<Character> stck = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		boolean tag = false;
		
			for(int i=0; i<str.length(); i++) {
				if (str.charAt(i)=='<') {
					while(!stck.empty()) {
						sb.append(stck.pop());
					}
					tag = true;
					sb.append("<");
					
				} else if(str.charAt(i)=='>') {
					tag = false;
					sb.append(">");
				} else if(tag) { //tag가 true일 때에만 동작
					//System.out.println(tag);
					sb.append(str.charAt(i));
				}
				else {
					
					if(str.charAt(i) != ' ') { //문자를 만나면
						stck.push(str.charAt(i));
					} else if(str.charAt(i) == ' '){ //공백을 만나거나 개행문자를 만나면
						while(!stck.empty()) {
						sb.append(stck.pop());
						}
						sb.append(" ");
					}
				}
			}
			
			while(!stck.empty()) {
				sb.append(stck.pop());
				
			}
			System.out.println(sb);
		}
		
		


	}
