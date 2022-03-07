package code12_06;

public class Main2 {
	public static void main(String[] args) {
		Character[] c = new Character[5];

		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();

		showHP(c);
		//冒険の開始！
		//まずは宿屋に泊まる

		//見せ消し
//		for (int i = 0; i < c.length; i++) {
//			c[i].hp += 50;
//		}
		for (Character ch : c) {
			ch.hp += 50;
		}
	}
	//パーティー全員のHPを表示する
	public static void showHP(Character[] c) {
		for (Character ch : c) {
			System.out.println("HP=" +ch.hp );
		}
	}

}
