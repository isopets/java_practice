package code3_03;

public class Main {

	public static void main(String[] args) {
		int age= 18; //年齢
		int month = 5; //生まれた月

//		年齢が１８歳以上で、５月生まれの場合はTrue、そうじゃない場合はfalse
		if (age >= 18 && month == 5) {
			System.out.println("18歳以上で5月生まれです");
		} else {
			System.out.println("18歳未満か５月以外の生まれです");
		}
	}
}
