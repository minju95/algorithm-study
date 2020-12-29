package dfs_ch05;
import java.util.*;

public class Ch05_02_11262020 {
	public static void main(String[] args) {
		Queue<Integer> value = new LinkedList<>();
		
		value.offer(5);
		value.offer(2);
		value.offer(3);
		value.offer(7);
		
		value.poll();
		value.offer(1);
		value.offer(4);
		value.poll();
		
		System.out.println(value);
		
		while(!value.isEmpty()) {
			value.peek();
			System.out.print(value.poll()+" ");
		}
		
		
		
	}

}
