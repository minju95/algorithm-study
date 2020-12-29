package dfs_ch05;


public class Ch05_06_11292020 {
	public static final int INF = 999999999;
	public static int [][] graph = {{0,7,5}, {7,0,INF}, {5,INF}};	
	
	public static void main(String[] args) {
		for(int i=0; i<graph.length; i++) {
			for(int j=0; j<graph[i].length; j++) {
				System.out.println("graph["+i+"]["+j+"] = "+graph[i][j]);
			}
		}
		
	}

}
