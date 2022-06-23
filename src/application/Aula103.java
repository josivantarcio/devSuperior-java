package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 * Working with CALENDAR
 * 
 * @author josevan
 *
 */
public class Aula103 {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat formatData = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Date sdf2 = Date.from(Instant.parse("2002-04-16T15:06:02Z"));

		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf2);
		cal.add(Calendar.DAY_OF_MONTH, 4);
		sdf2 = cal.getTime();
		System.out.println(formatData.format(sdf2));
		System.out.println("--------------");																																																						 
		
		//pegar parte do tempo
		
		int min = cal.get(Calendar.MINUTE);
		int month = 1+cal.get(Calendar.MONTH); //considera mes Janeiro inicial como 0(zero);
		System.out.println("min: " + min);
		System.out.println("month: " + month);

	}
}
