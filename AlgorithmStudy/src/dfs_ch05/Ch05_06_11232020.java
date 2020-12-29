package dfs_ch05;
import java.util.*;
public class Ch05_06_11232020 {

	public static void main(String[] args) {
		final int number = 999999999;
		
		//2차원 리스트를 이용해 인접행렬 표현
		int graph[][] = {{0, 7, 5}, {7, 0, number}, {5, number, 0}};
		
		//그래프 출력
		for(int i=0; i<graph.length; i++) {
			for(int j=0; j<graph[i].length; j++) {
				System.out.println("graph["+i+"]["+j+"]="+graph[i][j]);
			}
		}
	}
}
