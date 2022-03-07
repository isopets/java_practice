package code9_15;

public class Hero {
	String name;
	int hp;
	
	
	public Hero(String name) { //コンストラクタ①
		this.hp = 100;
		this.name = name;
	}
	public Hero() { //コンストラクタ②
		this("ダミー");
	}
}
