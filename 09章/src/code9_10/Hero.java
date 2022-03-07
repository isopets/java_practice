package code9_10;

public class Hero {
	String name;
	int hp;

	public Hero(String name) {
		this.hp = 100;
		this.name = "ダミー";
		//引数の値でnameフィールドを初期化
	}

	public Hero() {
		this.hp = 100;
		this.name = "ダミー";
		//ダミーの名前を設定
	}
}
