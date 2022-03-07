package code14_07;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();

		h.name = "ミナト";
		h.hp = 100;
		System.out.println(h);  //下と同じ
		System.out.println(h.toString());  //上と同じ

		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 150;
		System.out.println(h2);
	}
}
