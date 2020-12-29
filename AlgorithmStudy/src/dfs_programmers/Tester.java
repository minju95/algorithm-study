package dfs_programmers;

public class Tester {
	public static void main(String[] args){
		System.out.println("==========for-break");
		for(int i=0; i<10; i++){
			if(i==3) break;
			System.out.println(i);
		}
		System.out.println("break는 해당 roop만 종료시키지만, return은 해당 루프문을 가진 메소드를 종료시킴");
		
		
		
		System.out.println("==========for-return");
		for(int i=0; i<10; i++){
			if(i==3) return;
			System.out.println(i);
		}
		System.out.println("return이 실행되어 main메소드가 종료되어 이 문장은 실행되지 않는다");
	}
}