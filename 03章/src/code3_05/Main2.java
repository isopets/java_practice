package code3_05;

public class Main2 {
	public static void main(String[]args) {
		System.out.println("キーボードから数値を入力する");
		int integer = new java.util.Scanner(System.in) .nextInt();
		if (integer % 2 == 0 ) {
			System.out.println(integer + "は偶数です");
		} else {
			System.out.println(integer + "は奇数です");
		}
	}
}
