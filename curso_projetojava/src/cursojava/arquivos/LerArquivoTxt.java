package cursojava.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
;

public class LerArquivoTxt {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream entradaArquivo = new FileInputStream(new File(
				"C:\\Users\\bruno\\git\\repository\\curso_projetojava\\src\\cursojava\\arquivos\\arquivo.txt"));

		Scanner ler = new Scanner(entradaArquivo, "UTF-8");
		
		List<Pessoas> pessoaList = new ArrayList<Pessoas>();
		
		while (ler.hasNext()) {
			String linha = ler.nextLine();
			
			if(linha != null && !linha.isEmpty()) {
				String[] dados = linha.split("\\;");/*Regex para retirar o ; das linhas do arquivo txt*/
				
				Pessoas pessoa = new Pessoas();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				
				pessoaList.add(pessoa);
				
				
			}
			
		}
		
		for(Pessoas p : pessoaList) {
			System.out.println(p);
		}
	}

}
