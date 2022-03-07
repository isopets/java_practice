package code3_04;

public class Main2 {

	public static void main(String[] args) {
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4) + 1;

		//		switch文で表現した場合
		switch (fortune) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("吉");
			break;
		default:
			System.out.println("凶");
		}

		//		if else文で表現した場合
		//		if (fortune == 1) {
		//			System.out.println("大吉");
		//			} else if (fortune == 2) {
		//			System.out.println("中吉");
		//			} else if (fortune == 3) {
		//			System.out.println("吉");
		//			} else {
		//			System.out.println("凶");
		//			}
	}
}
