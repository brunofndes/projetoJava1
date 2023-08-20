package cursojava.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataNovaApi {

	public static void main(String[] args) {
		/*Usando nova API de datas a partir de JAVA 8*/
		
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("data de hoje " +
		dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAgr = LocalTime.now();
		
		System.out.println("hora agora: " + 
		horaAgr.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		
		System.out.println("data e hora atuais: " +
				dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

	}

}
