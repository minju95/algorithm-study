package this_is_java;
import java.util.*;

public class StackExample_11232020 {

	public static void main(String[] args) {
		Stack<Coin_11232020> coinBox = new Stack<Coin_11232020>();
		coinBox.push(new Coin_11232020(100));
		coinBox.push(new Coin_11232020(50));
		coinBox.push(new Coin_11232020(500));
		coinBox.push(new Coin_11232020(10));
		
		while(!coinBox.isEmpty()) {
			Coin_11232020 coin = coinBox.pop();
			System.out.println("꺼내온 동전 "+coin.getValue()+"원");
		}
	}

}
