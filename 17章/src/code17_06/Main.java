package code17_06;

import java.io.FileWriter;
// 変数fwのスコープを広げると => エラー
public class Main {

	public static void main(String[] args) {
		FileWriter fw = new FileWriter("data.txt");
		try {
			fw.write("Hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生いました。");
		}finally {
			fw.close();
		}
	}

}
