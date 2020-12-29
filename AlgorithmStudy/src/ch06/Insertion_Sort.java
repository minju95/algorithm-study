package ch06;
//삽입 정렬
public class Insertion_Sort {
	public static void main(String[] args) {
		int n = 10;
		int [] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		for(int i=1; i<n; i++) {	
			
			//j -> 인덱스 i부터 1까지 감소하며 반복
			for(int j=i; j>0; j--) {
				System.out.println("i= "+i);
				//1칸씩 왼쪽으로 이동
				if(arr[j]<arr[j-1]) { //앞 숫자가 바로 뒷 숫자보다 크면
					System.out.println("j= "+j);
					System.out.println("j-1= "+(j-1));
					System.out.println("arr["+j+"]= "+arr[j]);
					System.out.println("arr["+(j-1)+"]= "+arr[j-1]);
					System.out.println("");
					
					//스와프
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					
					for(int k=0; k<n; k++) {
						System.out.print(arr[k]+" ");
					}
					System.out.println("");
					
				}
				else break;
			}
			
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
