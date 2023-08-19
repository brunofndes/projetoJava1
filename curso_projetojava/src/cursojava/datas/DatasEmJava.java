package cursojava.datas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) {
		Calendar calendario = Calendar.getInstance();
		Date date = new Date();
		
		System.out.println(date.getDate());
		System.out.println("Data calendar " + calendario.get(Calendar.DATE));
		System.out.println("Data calendar " + calendario.get(Calendar.DAY_OF_WEEK));
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Calendar fata atual formatada " + simpleDateFormat.format(calendario.getTime()));
	}

}
