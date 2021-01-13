package codePlus.AGBasic1.data_structure1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Stack_17298_ver2 { 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(bf.readLine());
		
		int [] arr = new int[size]; //3 5 2 7
		int [] answer = new int[size];
		String[] temp = bf.readLine().split(" ");
		
		for(int i=0; i<size; i++) {
			arr[i] = Integer.parseInt(temp[i]);
		}
		
		//참고: 스택에서 어떤 수의 인덱스를 찾는 것은 불가
		Stack<Integer> stck = new Stack<>();
		
		stck.push(0);// arr에 있는 첫번째 수의 인덱스를 스택에 삽입
		
		//오큰수를 찾는 과정
		for(int i=1; i<size; i++) {
			
			if(stck.isEmpty()) { //비어 있으면
				stck.push(i);
			}
			
			while(!stck.isEmpty() && arr[stck.peek()]<arr[i]) {
				//arr[스택의 맨 위 숫자(=인덱스)]보다 arr[i]가 큰 경우
				answer[stck.pop()] = arr[i];
				//arr[i]를 answer[스택에서 pop한 숫자(=인덱스)]자리에 넣어줌
			}
			
			stck.push(i); //스택에 arr의 인덱스값(i)을 넣어줌
		}
		
		// 주어진 배열의 수를 모두 루프에 돌렸음에도 오큰수를 찾지 못한 경우
 		while(!stck.empty()) {
			answer[stck.pop()] = -1;
		}
 		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//맨 마지막 출력물 
		for(int i=0; i<size; i++) {
			bw.write(answer[i]+" ");
		}
			bw.flush();
	}
}
