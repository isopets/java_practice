package code14_09;

public class Main {

	public static void main(String[] args) {
		Hero.money = 100;
		System.out.println(Hero.money);
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		System.out.println(h1.hp);
		System.out.println("Heroクラス:" + Hero.money);
		
		System.out.println("h1インスタンス:" + h1.money);
		h1.money = 300;
		System.out.println("h2インスタンス"  + h2.money);
	}

}
