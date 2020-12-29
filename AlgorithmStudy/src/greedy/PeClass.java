package greedy;

import java.util.*;

class PeClass {
	public static void main(String[] args) {
    //public int solution(int n, int[] lost, int[] reserve) {
		int n =5;
        int [] lost = {2,4};
        int [] reserve = {3};
        
    	int answer = 0;
    	
        
        int[] array = new int[n]; //n만큼 배열의 크기를 정함
        
        //System.out.println(array[3]);
        
        for(int i=0; i<array.length; i++) {
        	array[i]= 1;
        	System.out.print(array[i]+" "); // 1 1 1 1 1 
        }
        
        for(int i=0;i<lost.length; i++) {
        	for(int j=0; j<array.length; j++) {
        		array[i]=0;
        	}
        }
        
        System.out.println();
        System.out.println("----------");
        for(int i=0; i<array.length; i++) {
        	System.out.print(array[i]+" ");
        }
	
	}
}