package dfs_ch05;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ch05_07 {
	public static ArrayList<ArrayList<Ch05_07_Node>> graph = new ArrayList<ArrayList<Ch05_07_Node>>();
	
	public static void main(String[] args) {
		//그래프 초기화
		for(int i=0; i<3; i++) {
			graph.add(new ArrayList<Ch05_07_Node>());
		}
		
		//노드 0에 연결된 노드 정보 저장(노드, 거리)
		graph.get(0).add(new Ch05_07_Node(1, 7));
		graph.get(0).add(new Ch05_07_Node(2, 5));
		
		graph.get(1).add(new Ch05_07_Node(0, 7));
		
		graph.get(2).add(new Ch05_07_Node(0, 5));
		
		for(int i=0; i<3; i++ ) {
			for(int j=0; j<graph.get(i).size(); j++) {
				graph.get(i).get(j).show();
			}
			System.out.println(7);
		}
	}

}
