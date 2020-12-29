package ch06;
//선택 정렬
public class Selection_Sort {

	public static void main(String[] args) {
		int n = 10;
		int arr[] = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		//  인덱스           0  1  2  3  4  5  6  7  8  9
		
		//큰 for문
		for(int i=0; i<n; i++) {
			int min_index = i; 
			System.out.println("정렬된 데이터를 제외한 나머지 데이터를 기준으로 가장 앞에 있는 원소의 인덱스= "+min_index);
			System.out.println("정렬된 데이터를 제외한 나머지 데이터를 기준으로 가장 앞에 있는 원소= "+arr[min_index]);
			//선형 탐색 (순차 탐색)
			for(int j=i+1; j<n; j++) {
				// min_index: 가장 작은 원소의 인덱스
				if(arr[min_index]>arr[j]) { //min_index의 값이 바로 뒷 숫자보다 더 크면
					min_index = j; //j(인덱스)를 min_index로 변경
					// i가 0일 때,min_index = 1 -> 3
					System.out.println(arr[i]+"와 비교했을 때 가장 작은 원소의 인덱스= "+min_index);
					System.out.println(arr[i]+"와 비교했을 때 가장 작은 원소= "+arr[min_index]);
				}
				System.out.println("");
			}
			for(int k=0; k<n; k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println("");
			System.out.println("i = "+i+", min_index= "+min_index);
			//작은 for문이 종료된 후 큰 for문을 다시 돌리기 전
			
			//스와프 : arr[i]와 arr[min_index]값을 서로 바꿔치기
			System.out.println("arr["+i+"]= "+arr[i]);
			System.out.println("arr["+min_index+"]= "+arr[min_index]);
			System.out.println(arr[i]+"와 "+arr[min_index]+"를 바꾸면?");
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
			
			
			for(int k=0; k<n; k++) {
				System.out.print(arr[k]+" ");
			}
			System.out.println("");
			System.out.println("");
			
		}
		
		System.out.println("------------");
		// 출력용
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
