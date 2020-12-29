package dfs_ch05;
import java.util.*;

public class Ch05_01_11232020 {

	public static void main(String[] args) {
		Stack<Integer> stackExample= new Stack<>();
		stackExample.push(5);
		stackExample.push(2);
		stackExample.push(3);
		stackExample.push(7);
		
		stackExample.pop();
		stackExample.push(1);
		stackExample.push(4);
		stackExample.pop();
	
		System.out.println(stackExample);
		
		System.out.println("============");
		//스택의 최상단 원소부터 출력
		while(!stackExample.isEmpty()) {
			System.out.println(stackExample.peek()+" ");
			stackExample.pop();
		}
	}

}
