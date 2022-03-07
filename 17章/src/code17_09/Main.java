
package code17_09;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.txt");
			fw.write("Hello!");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生いました。");
		}finally {
			if (fw != null) {
			try {
				fw.close();
			} catch (IOException e) {
				;
			}
			}
		}
	}
}