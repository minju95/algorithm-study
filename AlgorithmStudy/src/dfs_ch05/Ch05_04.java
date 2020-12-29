package dfs_ch05;
import java.util.*;

public class Ch05_04 {

	public static void main(String[] args) {
		recursive_function(1);
	}
	
	public static void recursive_function(int i) {
		if(i==100) {
			System.out.println(i+"번째 재귀함수에서"+(i+1)+"번째 재귀함수를 호출합니다.");
			recursive_function(i+1);
			System.out.println(i+"번 째 재귀함수를 종료합니다.");
		}
	}

}
