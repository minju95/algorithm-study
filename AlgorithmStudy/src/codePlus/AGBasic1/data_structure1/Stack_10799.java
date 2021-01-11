package codePlus.AGBasic1.data_structure1;

import java.util.Scanner;
import java.util.Stack;

public class Stack_10799 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String brackets;
		
		brackets = sc.nextLine().trim(); //trim(): 공백 제거 메소드
		//스택에 '('괄호 자체를 넣는 것이 아니라 해당 괄호의 위치에 해당하는 인덱스 번호를 넣어주는 것이 힌트
		int answer = 0;
		
		Stack<Integer> stck = new Stack<>();
			
		for(int i=0; i<brackets.length(); i++) {
			char oneBracket = brackets.charAt(i);
			if(oneBracket == '(') {
				stck.push(i);
			} else { // ')'괄호를 만나면
				if(stck.peek() +1 ==i) { // (스택의 맨 위 숫자 +1) 값이  ')'이 괄호의 인덱스 번호와 동일하다면 (=레이저라면)
					stck.pop();
					answer+=stck.size(); //스택 크기만큼 쇠막대기가 잘리고 ->그 개수가 다시 answer에 축적 
				} else { //쇠막대기의 끝이라면
					stck.pop();
					answer +=1;
				}
			}
		}
		System.out.println(answer);
		
		
		
	}
}