package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		Calendar calendario = Calendar.getInstance();
		
		calendario.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("20-08-2023"));
		calendario.add(Calendar.DAY_OF_MONTH, 5);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendario.getTime()));
		
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2023-07-27"), LocalDate.now());
		
		System.out.println("Possui " + dias + " dias entre uma data e outra");
	}

}
