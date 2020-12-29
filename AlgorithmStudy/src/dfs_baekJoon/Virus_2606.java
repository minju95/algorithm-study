package dfs_baekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Virus_2606 {
	//중첩 arraylist로 문제 풀 예정
	static int nodeNo;
	static int edge; //간선의 수(=노드 쌍의 개수)
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	static boolean[] visited; 
	// static boolean[] visited = new boolean[nodeNo+1]; //nodeNo가 정확하게 정해지지 않은 상태에서 1을 증가시켰으므로 오류 발생
	static int cnt;
	
	public static void main(String[] args) throws NumberFormatException , IOException {
		//선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("숫자를 입력해라");
		nodeNo = Integer.parseInt(br.readLine());
		edge = Integer.parseInt(br.readLine());
		
		visited = new boolean[nodeNo+1]; //사용자로부터 입력을 받고 int로 변경해준 후에야 비로소 제대로 작동
		for(int i=0; i<=nodeNo; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		String str;
		int v1;
		int v2;
		for(int i=0; i<edge; i++) {
			str = br.readLine();
			v1 = Integer.parseInt(str.split(" ")[0]);
			v2 = Integer.parseInt(str.split(" ")[1]);
			// System.out.println(v2);
			
			//그래프에 v1, v2값을 삽입
			graph.get(v1).add(v2);
			graph.get(v2).add(v1); //반대로도 삽입
		}
		
		cnt = 0;
		dfs(1);
		System.out.println("1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수 = "+cnt);
	}
	
	
	static void dfs(int start) {
		visited[start] = true;
		
		for(int i=0; i<graph.get(start).size(); i++) {
			int y = graph.get(start).get(i);
			if(!visited[y]) {
				cnt++;
				dfs(y);
			}
		}
	}
}
