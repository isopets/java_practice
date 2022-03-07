package code16_00;

import java.util.ArrayList;

public class Main {
	public static void main (String[]args) {
		
		////配列を使ったコード////
		
		//配列を準備
		String[] names = new String[3];
		
		//３人を追加
		names[0] = "たなか";
		names[1] = "すずき";
		names[2] = "さいとう";
		
		//２人目を表示
		System.out.println(names[1]);	
		
		/////////////////////////////////////////////////////////////////////
		
		////ArrayListを使ったコード////
		
		//ArrayListを準備
		ArrayList<String> names2 = new ArrayList<String>();
		
		//3人を追加
		names2.add("たなか");
		names2.add("すずき");
		names2.add("さいとう");
		
		//2人目を表示
		System.out.println(names2.get(1));
		1
	}
}