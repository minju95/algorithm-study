package dfs_ch05;
import java.util.*;
public class Ch05_01_11262020 {

	public static void main(String[] args) {
		Stack<Integer> stck = new Stack<>();
		
		stck.push(5);
		stck.push(2);
		stck.push(3);
		stck.push(7);
		stck.pop();
		stck.push(1);
		stck.push(4);
		stck.pop();

		System.out.println(stck);
		
		//최상단 데이터부터 꺼내서 출력
		while(!stck.empty()) {
			stck.peek();
			 System.out.print(stck.peek()+ " ");
			stck.pop();
		}
		
		
		
		
	}

}
