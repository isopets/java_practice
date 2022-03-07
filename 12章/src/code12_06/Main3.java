package code12_06;

public class Main3 {

	public static void main(String[] args) {
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new Matango();
		for (Monster m : monsters) {
			m.run();
		}
	}

}
