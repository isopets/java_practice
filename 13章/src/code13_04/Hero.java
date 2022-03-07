package code13_04;

public class Hero {
	private int hp;
	private String name;
	private Sword sword;

	public String getName() {
		return this.name;
	}

	public void bye() {
		System.out.println("勇者は別れを告げた");
	}
	public void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した！");
	}
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
		this.hp -= 2;//反撃を受けるとHPが２減る
		if(this.hp <= 0) {
			this.die();
		}
	}

}
