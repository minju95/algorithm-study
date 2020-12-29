package greedy;

import java.lang.reflect.Array;

public class GreatestNum {

	public static void main(String[] args) {
		String number = "1924";
		int k = 2;
		String answer = "";
		int count = 0;
		
		
			for(int i=0; i<number.length(); i++) { //number의 크기만큼 돌면서
				String test = number.replace(number.charAt(i), ' '); //차례대로 공백을 만들어줌
				test = test.trim(); //앞 뒤 공백제거
				test = test.replaceAll(" ", ""); //문자열 중간에 있는 공백 제거
				System.out.println("숫자 없애기 첫번째 "+test);
				
				for(int j=0; j<test.length(); j++) {
					String test2 = test.replace(test.charAt(j), ' '); //차례대로 공백을 만들어줌
					test2 = test2.trim(); //앞 뒤 공백제거
					test2 = test2.replaceAll(" ", ""); //문자열 중간에 있는 공백 제거
					System.out.println("둘"+test2);
					count++;
					
				}
			}
			String[] array = new String[count];
			int a = array.length;
			System.out.println("개수"+a);
				
			}
		
	}
