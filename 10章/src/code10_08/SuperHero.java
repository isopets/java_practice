package code10_08;

public class SuperHero extends Hero {
	boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	//着地する
	public void land() {
		this.flying = false;
		System.out.println("着地した！");
	}
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
	public void attack(Matango m) {
		super.attack(m);
		if(this.flying) {
			super.attack(m);
		}
	/*
	public void attack (Matango m) {
		System.out.println(this.name+ "攻撃！");
		System.out.println("5ポイントのダメージをあたえた！");
		if(this.flying) {
			System.out.println("5ポイントのダメージをあたえた！");
		}
	*/

	}
	}