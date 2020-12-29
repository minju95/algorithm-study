package recursion_baekjoon;

public class TreeRound {
	private int node;
	public TreeRound leftChild;
	public TreeRound rightChild;
	
	public TreeRound() { // 생성자
		this.node = 0;
		this.leftChild = null;
		this.rightChild = null;
	}

	public int getNode() {
		return this.node;
	}
}
