package code15_14;

import java.time.*;

public class Main {

	public static void main(String[] args) {
		//Instantの生成
		Instant i1= Instant.now();

		//Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long 1 = i2.toEpochMilli();

		//ZonedDateTimeの生成
		ZonedDateTime z1 = zonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));

		//InstantとZonedDatetimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		//
		System.out.println("東京:" + z2.getYear() + z.2getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン:" + z3.getYear() + z.3getMonth() + z.3getDayOfMonth());
		if (z2.isEqual(z3)) {
		System.out.println("これらは同じ瞬間を指しています");
		}
	}
}
