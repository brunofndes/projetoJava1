
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import curso_projetojava.classes.Aluno;
import curso_projetojava.classes.Disciplina;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 2; qtd++) {

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

		for (Aluno aluno : alunos) {

			if (aluno.getNome().equalsIgnoreCase("bruno")) {
				alunos.remove(aluno);
				break;

			} else {
				System.out.println(aluno);
				System.out.println(aluno.getNome());
				System.out.println("Media do aluno = " + aluno.getMedia());
				System.out.println("Resultado = " + (aluno.getAprovacao()));
				System.out.println("-------------------------------------------------------------------------");

			}

		}

		for (Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista");
			System.out.println(aluno.getNome());
			System.out.println("Suas materias são:");
			
			for (Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
				
			}
		}

	}

}
