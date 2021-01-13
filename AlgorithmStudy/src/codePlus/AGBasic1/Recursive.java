package codePlus.AGBasic1;

public class Recursive {
	static int sum = 0;
	
	
	public static int forLoop() {
		for(int i=1; i<=100;i++) {
			sum +=i;
		}
		return sum;
	}
	
	static int no2 = 0;
	public static int recursiveCall(int no1) {
		if(no1 == 1) {
			return 1;
		} else {
			return no1+recursiveCall(no1-1);
			/*
			 * 5+recursiveCall(4)
			 * 5+ (4+recursiveCall(3))
			 * 5+4+ (3+recursiveCall(2))
			 * 5+4+3+ (2+recursiveCall(1))
			 * 5+4+3+  2+1
			 * */
		}
	}

	public static void main(String[] args) {
		//System.out.println(forLoop());
		System.out.println(recursiveCall(5));
	}
}
