package code16_01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<>();
		points.add(10);
		points.add(80);
		points.add(75);
		//int x = pojnts.get(3); // IndexOutOfBoundsExceptionが発生する　☆コンパイルエラー☆
		for(int i : points) {
			System.out.println(i);
		}

		/*オートボクシングやオートアンボクシングではなく、
		 * 明示的に変換する方法*/

		//int型からIntegerインスタンスを生成する
		Integer i1 = new Integer(16);  //Java9では非推奨
		Integer i2 = Integer.valueOf(16);  //staticメソッドを使って生成

		//Integerインスタンスからint型を取り出す
		int i3 = i1.intValue();
	}
}
