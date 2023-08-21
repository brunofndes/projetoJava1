package cursojava.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		Pessoas pessoa1 = new Pessoas();
		pessoa1.setNome("Bruno Fernandes");
		pessoa1.setEmail("bruno@gmail.com");
		pessoa1.setIdade(28);
		
		Pessoas pessoa2 = new Pessoas();
		pessoa2.setNome("Lucas Fernandes");
		pessoa2.setEmail("lucas@gmail.com");
		pessoa2.setIdade(29);
		
		Pessoas pessoa3 = new Pessoas();
		pessoa3.setNome("Patricia Fernandes");
		pessoa3.setEmail("patricia@gmail.com");
		pessoa3.setIdade(20);
		
		List<Pessoas> pessoaList = new ArrayList<Pessoas>();
		pessoaList.add(pessoa1);
		pessoaList.add(pessoa2);
		pessoaList.add(pessoa3);
		
		File arquivo = new File("C:\\Users\\bruno\\git\\repository\\curso_projetojava\\src\\cursojava\\arquivos\\arquivo.csv");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for (Pessoas p : pessoaList) {
			escrever_no_arquivo.write(p.getNome() + ";" + p.getEmail() + ";" + p.getIdade() + "\n");
		}
		
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}

}
