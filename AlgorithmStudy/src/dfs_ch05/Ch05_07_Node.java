package dfs_ch05;

public class Ch05_07_Node {

	private int index;
	private int distance;
	
	//생성자
	public Ch05_07_Node(int index, int distance) {
		this.index = index;
		this.distance = distance;
	}
	
	public void show() {
		System.out.println("("+this.index+","+this.distance+") ");
	}
	
}
