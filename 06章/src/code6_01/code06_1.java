package code6_01;

import code6_02.CalcLogic;

public class code06_1 {

	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = CalcLogic.tasu(a,b);
		int delta = CalcLogic.hiku(a,b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
