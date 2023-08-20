package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		Calendar calendario = Calendar.getInstance();
		
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("18/08/2023");
		
		Date dataAtual = simpleDateFormat.parse("20/08/2023");
		
		if(dataVencimentoBoleto.after(dataAtual)) {
			System.out.println("Boleto não vencido");
		}else {
			System.out.println("BOLETO VENCIDO");
		}
	}

}
