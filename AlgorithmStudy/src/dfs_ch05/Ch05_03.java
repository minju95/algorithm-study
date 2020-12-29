package dfs_ch05;

public class Ch05_03 {

	public static void main(String[] args) {
		recursive_function();
	}
	
	public static void recursive_function() {
		System.out.println("재귀함수를 호출합니다.");
		recursive_function();
	}

}
