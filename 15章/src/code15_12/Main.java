package code15_12;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//
		c.set(2019,8,22,1,23,45);
		c.set(Calendar.MONTH, 9); //月を取り出す
		Date d = c.getTime();
		System.out.println(d);
		//
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH);
		m++;
		int dd
		System.out.println("今年は" + y + "年です");
	}

}
