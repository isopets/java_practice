package code16_01;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {
		ArrayList<Hero> heros = new ArrayList<>();
		Hero h1 = new Hero("ミナト", 100);
		Hero h2 = new Hero("アサカ", 120);
		Hero h3 = new Hero("スガワラ", 300);

		//普通のfor文
		for (int i = 0; i < heros.size(); i++ ) {
			System.out.println(heros.get(i).getName() + " ");
		}
		System.out.println();

		//拡張for文
			for (Hero h : heros) {
				System.out.println(h.getName() + " ");
			}
			System.out.println();
			//HeroクラスのtoString()で文字列作成して表示
			for (Hero h : heros) {
				System.out.println(h);
			}
		}
	}
