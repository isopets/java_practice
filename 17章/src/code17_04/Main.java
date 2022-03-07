package code17_04;

import java.io.FileWriter;

// try-catchの後でcloseすると => エラーになる
public class Main {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("Hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生いました。");
		}
		fw.close();
		//↑↑こいつが問題児↑↑
	}

}
