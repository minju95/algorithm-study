package dfs_ch05;

import java.util.ArrayList;

public class Ch05_07_11292020 { //행이 3개인 인접리스트 표현
	public static ArrayList<ArrayList<Ch05_07_Node_11292020>> graph = new ArrayList<ArrayList<Ch05_07_Node_11292020>>();
	
	public static void main(String[] args) {
		// 그래프 초기화
		for(int i=0; i<3; i++) {
			graph.add(new ArrayList<Ch05_07_Node_11292020>());
		}
		System.out.println(graph); // [[], [], []] 이런식으로 그래프 초기화
		
		graph.get(0).add(new Ch05_07_Node_11292020(1, 7));
		// graph.get(0).get(0).show(); // (1,7)
		
		graph.get(0).add(new Ch05_07_Node_11292020(2, 5));
		// graph.get(0).get(1).show(); // (2,5)
		
		graph.get(1).add(new Ch05_07_Node_11292020(0, 7));
		
		graph.get(2).add(new Ch05_07_Node_11292020(0, 5));
		
		// 각 노드별(0번 노드, 1번 노드, 2번 노드) 크기
		for(int i=0; i<graph.size(); i++) {
			System.out.println(graph.get(i).size());
		}
		
		// 그래프 출력
		for(int i=0; i<graph.size(); i++) {
			for(int j=0; j<graph.get(i).size(); j++) {
				graph.get(i).get(j).show();
			}
		}
		
		
	}

}
