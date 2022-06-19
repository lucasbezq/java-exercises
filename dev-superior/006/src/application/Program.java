package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println(sdf.format(date));

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int minutes = calendar.get(Calendar.MINUTE);
		int month = 1 + calendar.get(Calendar.MONTH);
//		calendar.add(Calendar.HOUR_OF_DAY, 4);
//		date = calendar.getTime();
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}

}
