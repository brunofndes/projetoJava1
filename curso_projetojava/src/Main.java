
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import curso_projetojava.classes.Aluno;
import curso_projetojava.classes.Diretor;
import curso_projetojava.classes.Disciplina;
import curso_projetojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticar;
import cursojava.constantes.StatusAlunos;
import cursojava.interfaces.PermitirAcesso;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		
				
		
		if(new FuncaoAutenticar(new Diretor(login,senha)).autentitar()) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*Lista mapeada contendo uma chave identificando os valores*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		

		for (int qtd = 1; qtd <= 5; qtd++) {

			String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade"); String cpf =
			 * JOptionPane.showInputDialog("Qual cpf? :"); String nomePai =
			 * JOptionPane.showInputDialog("nome do pai?"); String nomeMae =
			 * JOptionPane.showInputDialog("nome do mae?");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade)); aluno1.setNumeroCpf(cpf);
			 * aluno1.setNomePai(nomePai); aluno1.setNomeMae(nomeMae);
			 */

			/* Loop para adicionar disciplinas */
			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ? ");
				String notaDisciplina = JOptionPane.showInputDialog("NOta da disciplina " + pos + " ? ");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);

			}

			int escolhaDisciplina = JOptionPane.showConfirmDialog(null, " Deseja remover alguma disciplina?");
			/* Removendo disciplinas */
			if (escolhaDisciplina == 0) {
				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual disciplina deseja remover 1,2,3,4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja remover mais uma desciplina?");
				}
			}

			alunos.add(aluno1);

			
		}
		
		maps.put(StatusAlunos.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAlunos.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAlunos.RECUPERACAO, new ArrayList<Aluno>());
		
		
		/*Adicionando os alunos aprovados, reprovados e recuperação nas listas*/
		for (Aluno aluno : alunos) {
			
			if(aluno.getAprovacao().equalsIgnoreCase(StatusAlunos.APROVADO)) {
				maps.get(StatusAlunos.APROVADO).add(aluno);
			}else			
			if(aluno.getAprovacao().equalsIgnoreCase(StatusAlunos.REPROVADO)) {
				maps.get(StatusAlunos.REPROVADO).add(aluno);
			}else			
			if(aluno.getAprovacao().equalsIgnoreCase(StatusAlunos.RECUPERACAO)) {
				maps.get(StatusAlunos.RECUPERACAO).add(aluno);
			}
			
		}
		
		System.out.println("-----------------Lista dos Aprovados-----------------");
		for (Aluno aluno : maps.get(StatusAlunos.APROVADO)) {
			System.out.println(aluno.getNome() + " Resultado = " + aluno.getAprovacao() + " com média de = " + aluno.getMedia());
		}
		
		System.out.println("-----------------Lista dos Reprovados-----------------");
		for (Aluno aluno : maps.get(StatusAlunos.REPROVADO)) {
			System.out.println(aluno.getNome() + " Resultado = " + aluno.getAprovacao() + " com média de = " + aluno.getMedia());
		}
		
		System.out.println("-----------------Lista dos Recuperação-----------------");
		for (Aluno aluno : maps.get(StatusAlunos.RECUPERACAO)) {
			System.out.println(aluno.getNome() + " Resultado = " + aluno.getAprovacao() + " com média de = " + aluno.getMedia());
		}
		

		

		}else {
			JOptionPane.showMessageDialog(null, "Login não permitido");
		}
		
	}

}
