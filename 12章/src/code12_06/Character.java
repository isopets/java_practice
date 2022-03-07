package code12_06;

public 	abstract class Character {
	String name;
	int hp;

	public void run() {
		System.out.println("走って逃げた");
	}
	public abstract void attack (Monster m);
}
