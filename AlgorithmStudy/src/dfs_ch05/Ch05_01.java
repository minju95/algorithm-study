package dfs_ch05;
import java.util.*;

public class Ch05_01 {

	public static void main(String[] args) {
		Stack<Integer> stck = new Stack<>();
		//동전을 끼움
		stck.push(5);
		stck.push(2);
		stck.push(3);
		stck.push(7);
		stck.pop();
		stck.push(1);
		stck.push(4);
		stck.pop();
		//stack의 최상단 원소부터 출력
		while(!stck.empty()) { //동전 케이스가 비어있는지 확인
			System.out.println(stck.peek()); //peek: top이 가리키는 데이터를 읽는 메소드
			stck.pop();
		}
	}

}
