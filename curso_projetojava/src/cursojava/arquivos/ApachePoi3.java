package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi3 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream entrada = new FileInputStream(new File("C:\\Users\\bruno\\git\\repository\\curso_projetojava\\src\\cursojava\\arquivos\\arq_excel.xls"));
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);/*Prepara a entrada do arquivo excel a ser lido*/
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);/*Pega a primeira planilha do nosso arquivo excel*/
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		List<Pessoas> pessoasList = new ArrayList<Pessoas>();
		
		Pessoas pessoa = new Pessoas();
		
		while (linhaIterator.hasNext()) {
			
			Row linha = linhaIterator.next();/*Dados em cada linha da planilha*/
			
			Iterator<Cell> celulas = linha.iterator();
			
			while (celulas.hasNext()) {
				Cell cell = celulas.next();
				
				switch (cell.getColumnIndex()) {
				case 0: 
					pessoa.setNome(cell.getStringCellValue());
					break;
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
				}
			}
			
			pessoasList.add(pessoa);
			
		}
		
		entrada.close();
		
		for (Pessoas p : pessoasList) {
			System.out.println(p);
		}
		 
		 
	}
}
