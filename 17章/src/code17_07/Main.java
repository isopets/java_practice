package code17_07;

import java.io.FileWriter;
// tryブロック内でnewすると => エラー
public class Main {

	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter("data.txt");
			fw.write("Hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生いました。");
		}finally {
			fw.close();
		}
	}

}
