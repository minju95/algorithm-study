package dfs_ch05;

import java.util.LinkedList;
import java.util.Queue;

public class Ch05_02 {

	public static void main(String[] args) {
		Queue<Integer> value = new LinkedList<>();
		/* - Queue 인터페이스를 구현한 대표적인 클래스는 LinkedList
		 * - LinkedList 객체를 Queue 인터페이스 타입으로 변환한 것
		 * */
		
		value.offer(5);
		value.offer(2);
		value.offer(3);
		value.offer(7);
		
		value.poll();
		value.offer(1);
		value.offer(4);
		value.poll(); //poll(): 원소를 꺼내고 반환하는 역할(운영체제에서의 폴링과 동일)
		
		//먼저 들어온 원소부터 추출
		while(!value.isEmpty()) {
			System.out.println(value.poll());
		}
	}

}
