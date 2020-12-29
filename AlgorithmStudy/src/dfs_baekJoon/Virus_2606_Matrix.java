package dfs_baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Virus_2606_Matrix { //인접행렬로 DFS 풀어보기 (못 풀었음)
	
	static int nodeNo; //7
	static int edgeNo;
	static int[][] nodeArr;
	static boolean visited[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		try {
		System.out.println("숫자를 입력하세요.");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		nodeNo = Integer.parseInt(br.readLine());
		edgeNo = Integer.parseInt(br.readLine());
		
		// Integer.parseInt(br.readLine());
		nodeArr = new int[nodeNo+1][nodeNo+1];
		visited = new boolean[nodeNo+1];
		//System.out.println(nodeArr.length);
		
		//그래프 인접행렬 만들기
		/*
		 * for(int i=1; i<nodeArr.length; i++) { for(int j=1; j<nodeArr[i].length; j++)
		 * { String str = br.readLine(); System.out.println(str); i =
		 * Integer.parseInt(str.split(" ")[0]); j = Integer.parseInt(str.split(" ")[1]);
		 * // System.out.println(i); // System.out.println(j); nodeArr[i][j] =
		 * nodeArr[j][i] = 1;
		 * 
		 * // System.out.println("node["+i+"]["+j+"] = "+nodeArr[i][j]); } }
		 */
		System.out.println();
		for(int i=0; i<edgeNo; i++) {
			String str = br.readLine();
			int v1 = Integer.parseInt(str.split(" ")[0]);
			int v2 = Integer.parseInt(str.split(" ")[1]);
			System.out.println(v1);
			nodeArr[v1][v2] = nodeArr[v2][v1] = 1;
			
			System.out.println();
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
