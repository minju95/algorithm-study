package greedy;

import java.util.*;

class Solution {
	public static void main(String[] args) {
    //public int solution(int n, int[] lost, int[] reserve) {
		int n =5;
        int [] lost = {2,4};
        int [] reserve = {3};
        
    	int answer = 0;
    	
        
        Integer[] array = new Integer[n]; //n만큼 배열의 크기를 정함
        
        //System.out.println(array[3]);
        
        for(int i=0; i<array.length; i++) {
        	array[i]= i+1;
        	System.out.print(array[i]+" "); // 1 2 3 4 5
        }
        System.out.println();
        System.out.println("--------------");

        //체육복을 도난당한 학생들 번호 출력
        for(int i=0; i<lost.length; i++) {
        	System.out.print(lost[i]+" "); // 2 4 
        } 
        
        //전체 배열에서 체육복을 도난당한 학생들 번호를 뺀다
        System.out.println();
        System.out.println("----------");
        for(int i=0; i<lost.length; i++) {
        	for(int j=0; j<array.length; j++) {
        		if(lost[i]==array[j]) {
        			array[j]=0;
        		}
        		
        	}
        }
        
        System.out.println();
        System.out.println("----------");
        for(int i=0; i<array.length; i++) {
        	System.out.print(array[i]+" "); // 1 0 3 0 5
        }
        
        //체육복 여유분을 갖고 있는 학생들이 체육복을 도난당한 학생에게 체육복을 빌려준다.
        for(int i=0; i<reserve.length; i++) {
        	for(int j=0; j<array.length; j++) {
        		if(reserve[i]==array[j]) { //체육복 여유분을 갖고 있는 학생의 번호와 전체 배열에서의 학생번호가 같은 경우
        			if(j>1) {
        			array[j-1] = array[j-1]+1;
        			} else if(j==1) {
        				array[j]=array[j];
        			}
        		}
        		
        		
        	}
        }
        
        System.out.println();
        System.out.println("----------");
        
        for(int i=0; i<array.length; i++) {
        	System.out.print(array[i] +" ");
        }
        
        //배열을 list로 변경
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(array));
        
        
        for(int i=0; i<list.size(); i++) {
        	if(list.get(i) == 0) {
        		list.remove(i);
        	}
        }
        
        System.out.println();
        System.out.println("----------");
        
        for(int i=0; i<list.size(); i++) {
        	System.out.println(list.get(i));
        }
        
        
        System.out.println();
        System.out.println("----------");
       answer = list.size();
       System.out.println(answer);
	}
}