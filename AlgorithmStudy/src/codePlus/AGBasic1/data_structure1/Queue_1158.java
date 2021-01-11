package codePlus.AGBasic1.data_structure1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_1158 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int k = scn.nextInt();
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=1; i<=n;i++) {
			queue.add(i);
		}
		
		// System.out.println(queue);
		StringBuilder sb = new StringBuilder();
		sb.append("<");

//		while(!queue.isEmpty()) {
		//큐에서 데이터 뽑아낼 때마다 큐의 맨 앞자리 숫자가 달라진다는 걸 기억할 것
//			for(int i=1; i<=k; i++) {
//				queue.add(queue.poll());
//			}
//			System.out.print(queue.poll()+", "); //큐에서 맨 앞에 있는 데이터 뽑아내기 
			
//		}
		while(!queue.isEmpty()) {
			for(int i=1; i<=k;i++) {
				if(i!=k) {
					queue.add(queue.poll());
				} else { //k만큼 돌아갔으면
					sb.append(queue.poll()); //큐에서 데이터 뽑고 StringBuilder에 집어넣기
					sb.append(", ");
				}
			}
		}
		
		// System.out.println("'<'와 '숫자와 '콤마'를  넣은 stringbuilder: "+sb);
		// System.out.println(sb.length());
		
		String temp = sb.substring(0, sb.length()-2);
		//substring(int beginIndex,int endIndex) 메소드: beginIndex부터 endIndex 바로 전까지 값을 리턴
		//즉, 맨 마지막 쉼표와 공백을 제외한 길이
		
		sb = new StringBuilder(temp); //덧 씌우기
		
		sb.append(">");
		
		System.out.println(sb.toString());
		
 	}
	
}
