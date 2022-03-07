package code14_09;

public class Hero {
	String name;
	int hp;
	//ｐ.542のコード14-9を真似して
	static int money;  //パーティーの所持金

	//所持金をランダムで設定する
	public static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
		//staticメソッドの中では
		//thisは使えない
//		System.out.println(this.name + "たちの所持金を初期化");
	}

}
