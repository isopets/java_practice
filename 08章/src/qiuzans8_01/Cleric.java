package qiuzans8_01;

import java.util.Random;

public class Cleric {
	String name;
	int hp;
	final int MAX_HP = 50;
	int mp;
	final int MAX_MP = 10;

public void selfAid() {
	System.out.println(this.name + "は、セルフエイドを唱えた！");
	this.mp -= 5;
	this.hp = this.MAX_HP;
	System.out.println(this.name + "は、体力が全回復した。");
}
public int pray(int sec) {
	System.out.println(this.name + "は、" + sec + "秒祈りを行った！");

	//理論上の回復量を乱数を用いて決定した
	int recover = new Random() .nextInt(3) + sec;
	//実際の回復量を計算する
	int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

	this.mp += recoverActual;
	System.out.println("MPが" + recoverActual + "回復した");
	return recoverActual;
}
}
