package cursojava.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataParcelas {

	public static void main(String[] args) throws ParseException {
		
		Date dataInicialVencimento = new SimpleDateFormat("dd/MM/yyyy").parse("19/08/2023");
		
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(dataInicialVencimento);
		
		for(int parcela = 1; parcela <= 12; parcela++) {
			calendario.add(Calendar.MONTH, 1);
			
			System.out.println("Parcela de número " + parcela + " com vencimento em: "
					+ new SimpleDateFormat("dd/MM/yyyy").format(calendario.getTime()));
		}
	}

}
