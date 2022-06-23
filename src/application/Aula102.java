package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
//import java.time.Instant;
//import java.util.Calendar;
import java.util.Date;

/**
 * Working with DATETIME
 * @author josevan
 *
 */
public class Aula102 {
	public static void main(String[] args) throws ParseException {
		
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm dd/MM/yyyy");
		//Date sdf2 = Date.from(Instant.parse("2022-04-16T14:02:09Z"));
		
		Date dtnow = new Date();
		Date dtOld = new Date(0L);
		Date dt5h = new Date(1000L * 60L * 60L * 5L);
		
		Date d1 = sdf1.parse("08:00 05/01/22");
		System.out.println(d1);
		System.out.println(dtOld);
		System.out.println(sdf1.format(dtnow));
		System.out.println(sdf1.format(dt5h));
		
		
	}
}
