package dfs_ch05;

import java.util.ArrayList;

public class Ch05_08 {
	//방문처리를 위해 boolean 객체 생성 (x는 1부터 8까지)
	public static boolean[] visited = new boolean[9];
	/*
	 * boolean 배열의 크기를 9로 설정한 이유?
	 * - x의 범위는 1부터 8까지
	 * - 이 때, 노드 방문 여부를 나타내는 boolean 배열도 보기 쉽게 하려면 visited[1] ~ visited[8] 해야 함
	 * - 원래는 visited [0] ~ visited[7]이 맞는데 개발자가 보기 쉬운 숫자로 만들려다보니 1을 더함
	 * - 그래서 배열의 크기도 1을 늘린 9로 설정
	 * */
	
	
	//그래프 표현 -> 배열대신 중첩 ArrayList로 표현
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	//DFS 함수 정의
	public static void dfs(int x) { //main 메소드 보면 방문하고자 하는 노드인 x는 1부터 시작
		//현재 노드를 방문 처리
		visited[x]= true;
		System.out.print(x +" " +visited[x]+"   ");
		
		//현재 노드와 연결된 다른 노드를 재귀적으로 방문
		for(int i=0; i<graph.get(x).size(); i++) { //get(): 인자 인덱스의 위치에 있는 객체 리턴
			int y = graph.get(x).get(i);
			if(!visited[y]) { //방문되지 않은 노드라면
				dfs(y); //재귀함수 돌리기
			}
		}
	}
	
	public static void main(String[] args) {
		//그래프 초기화 (9개의 빈 노드가 있는 그래프 생성)
		for(int i=0; i<9; i++) {  
			graph.add(new ArrayList<Integer>());
			//System.out.println(graph); // [[], [], [], [], [], [], [], [], []]
		}
		
		//노드 1에 연결된 노드 정보 저장
		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(1).add(8);
		System.out.println(graph); // [[], [2, 3, 8], [], [], [], [], [], [], []]
		
		graph.get(2).add(1);
		graph.get(2).add(7);
		System.out.println(graph); // [[], [2, 3, 8], [1, 7], [], [], [], [], [], []]
		
		graph.get(3).add(1);
		graph.get(3).add(4);
		graph.get(3).add(5);
		System.out.println(graph); // [[], [2, 3, 8], [1, 7], [1, 4, 5], [], [], [], [], []]
		
		graph.get(4).add(3);
		graph.get(4).add(5); 
		System.out.println(graph); // [[], [2, 3, 8], [1, 7], [1, 4, 5], [3, 5], [], [], [], []]
		
		graph.get(5).add(3);
		graph.get(5).add(4);
		System.out.println(graph); // [[], [2, 3, 8], [1, 7], [1, 4, 5], [3, 5], [3, 4], [], [], []]
		
		graph.get(6).add(7);
		System.out.println(graph); // [[], [2, 3, 8], [1, 7], [1, 4, 5], [3, 5], [3, 4], [7], [], []]
		
		graph.get(7).add(2);
		graph.get(7).add(6);
		System.out.println(graph); // [[], [2, 3, 8], [1, 7], [1, 4, 5], [3, 5], [3, 4], [7], [2, 6], []]
		
		graph.get(8).add(1);
		graph.get(8).add(7);
		System.out.println(graph); // [[], [2, 3, 8], [1, 7], [1, 4, 5], [3, 5], [3, 4], [7], [2, 6], [1, 7]]
		
		dfs(1);
		
	}

}
