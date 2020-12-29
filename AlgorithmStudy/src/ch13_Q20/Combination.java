package ch13_Q20;

import java.util.ArrayList;

public class Combination {
	private int n; //행
	private int r; //열
	private int[] now; //현재 조합
	private ArrayList<ArrayList<Position>> result;
	
	public ArrayList<ArrayList<Position>> getResult() {
		return result;
	}

	public Combination(int n, int r) {
		this.n = n;
		this.r = r;
		this.now = new int[r];
		this.result = new ArrayList<ArrayList<Position>>();
	}
	
	public void combination(ArrayList<Position> arr, int depth, int index, int target) {
		if(depth == r) {
			ArrayList<Position> temp = new ArrayList<>();
			for(int i=0; i<now.length; i++) {
				temp.add(arr.get(now[i]));
			}
			result.add(temp);
			return;
		}
		if(target==n) return;
		now[index] = target;
		combination(arr, depth+1, index+1, target+1);
		combination(arr, depth, index, target+1);
	}
	
	
	
	
	
	
	
}
