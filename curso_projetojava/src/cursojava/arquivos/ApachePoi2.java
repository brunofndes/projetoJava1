package cursojava.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi2 {

	public static void main(String[] args) throws Exception {
		
		File file = new File(
				"C:\\Users\\bruno\\git\\repository\\curso_projetojava\\src\\cursojava\\arquivos\\ar3_excel.xls");

		if(!file.exists()) {
			file.createNewFile();
		}

		Pessoas pessoa1 = new Pessoas();
		pessoa1.setNome("Bruno Fernandes");
		pessoa1.setEmail("bruno@gmail.com");
		pessoa1.setIdade(28);

		Pessoas pessoa2 = new Pessoas();
		pessoa2.setNome("Outrea pessoa");
		pessoa2.setEmail("lucas@gmail.com");
		pessoa2.setIdade(29);

		Pessoas pessoa3 = new Pessoas();
		pessoa3.setNome("Aduilson de andrade");
		pessoa3.setEmail("patricia@gmail.com");
		pessoa3.setIdade(20);

		Pessoas pessoa4 = new Pessoas();
		pessoa4.setNome("Aduilson de andrade");
		pessoa4.setEmail("patriciasedasdaweqa@gmail.com");
		pessoa4.setIdade(203);

		List<Pessoas> pessoaList = new ArrayList<>();
		pessoaList.add(pessoa1);
		pessoaList.add(pessoa2);
		pessoaList.add(pessoa3);
		pessoaList.add(pessoa4);

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); /*objeto para escrever a planilha*/
		HSSFSheet linhasPessoaList = hssfWorkbook.createSheet("Planilha de Pessoas");

		int numeroLinha = 0;
		for (Pessoas p: pessoaList) {
			Row linha = linhasPessoaList.createRow(numeroLinha++); /*Criando as linhas da planilha*/

			int celula =0;

			Cell celulaDoNome = linha.createCell(celula++);
			celulaDoNome.setCellValue(p.getNome());

			Cell celulaDoEmail = linha.createCell(celula++);
			celulaDoEmail.setCellValue(p.getEmail());

			Cell celulaDaIdade = linha.createCell(celula++);
			celulaDaIdade.setCellValue(p.getIdade());


		}

		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida);
		saida.flush();
		saida.close();
		System.out.println("Carregou");


	}
}
