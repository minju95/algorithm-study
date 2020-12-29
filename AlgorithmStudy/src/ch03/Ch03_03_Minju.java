package ch03;

import java.util.*;
public class Ch03_03_Minju {

	public static void main(String[] args) {
		int n;
		int m;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행의 개수와 열의 개수를 차례로 입력하세요 ->");
		n = sc.nextInt(); //3
		m = sc.nextInt(); //3
		
		System.out.print("숫자를 입력하세요1 ->");
		
			int arr1[] = new int[m];
			for(int i=0; i<arr1.length; i++) {
				arr1[i]=sc.nextInt();
			}
		System.out.print("숫자를 입력하세요2 ->");
			int arr2[] = new int[m];
			for(int i=0; i<arr1.length; i++) {
				arr2[i]=sc.nextInt();
			}
		System.out.print("숫자를 입력하세요3 ->");	
			int arr3[] = new int[m];
			for(int i=0; i<arr1.length; i++) {
				arr3[i]=sc.nextInt();
			}
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			Arrays.sort(arr3);
			
			int max= 0;
			
			if(arr1[0]<=arr2[0]) {
				max = arr2[0];
				if(max<=arr3[0]) {
					max = arr3[0];
				}
			} else if(arr1[0]>=arr2[0]) {
				max = arr2[0];
				if(max<=arr3[0]) {
					max = arr3[0];
				}
			}
			
			System.out.print("최댓값은 ? "+max);
	}

}
