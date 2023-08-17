package cursojava.executavel;

import java.util.Iterator;

import javax.swing.JOptionPane;

import curso_projetojava.classes.Aluno;
import curso_projetojava.classes.Disciplina;

public class ArrayVetores {

	public static void main(String[] args) {
		
		double[] notasJava = {1.4,2.5,10.0,7.8};
		double[] notasProg = {9.6,8.5,2.0,3.7};
		
		
		
		Aluno aluno = new Aluno();
		aluno.setNome("Bruno");
		aluno.setNomeEscola("JDev");	
				
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		disciplina.setNota(notasJava);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Programação");
		disciplina2.setNota(notasProg);
		
		aluno.getDisciplinas().add(disciplina2);
		
		/*Array de objetos*/
		Aluno[] arrayAlunos = new Aluno[1];

		arrayAlunos[0] = aluno;
		
		for(int pos = 0; pos < arrayAlunos.length; pos++) {
			
			System.out.println("Nome do aluno: " + arrayAlunos[pos].getNome());
			
			for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				
				System.out.println("Disciplinas do aluno: " + 	d.getDisciplina());
				
				for(int posnota = 0; posnota < d.getNota().length; posnota++) {
					
					System.out.println("Nota "+(posnota + 1) + " do aluno: " + d.getNota()[posnota]);
				}
				
			}
		}
		
		
		
		
		/*
		System.out.println("Nome do aluno " + aluno.getNome() + " inscrito no curso de "
				+ aluno.getNomeEscola());
		
		percorrendo a lista de disciplinas do aluno
		for (Disciplina d : aluno.getDisciplinas()) {
			System.out.println("------------------Disciplinas do aluno-----------------");
			System.out.println("Disciplinas do aluno: " + d.getDisciplina());
			
			double notaMax = 0.0;
			double notaMin = 0.0;
			System.out.println("As notas são: ");	
			
			iterando as 4 notas dentro de cada disciplina e mostrando no console
			for (int pos = 0; pos < d.getNota().length; pos ++) {				
				System.out.println("Nota " + (pos + 1) + " é igual = " + d.getNota()[pos]);	
				
				verificação de maior e menor nota
				if(pos == 0) {
					notaMax = d.getNota()[pos];
					notaMin = d.getNota()[pos];
				}else {
					if(d.getNota()[pos] <= notaMin) {
						notaMin = d.getNota()[pos];
					}
					if(d.getNota()[pos] > notaMax) {
						notaMax = d.getNota()[pos];
					}
				}
				
			}
			
			System.out.println("A maior nota da Disciplina = " + d.getDisciplina() + " e de valor: " + notaMax);
			System.out.println("A menor nota da Disciplina = " + d.getDisciplina() + " e de valor: " + notaMin);
		}
		
		/*
		String posicoes = JOptionPane.showInputDialog("Quantas posições o arraay deeve ter?");
		
		Quantidade de posições sempre definidas
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		definir o valor que cada nota deve ter
		for (int pos = 0; pos < notas.length; pos++) {
			String valorNota = JOptionPane.showInputDialog("Qual o valor da nota na posição " + (pos + 1));
			notas[pos] = Double.valueOf(valorNota);			
			} 	
		
		
		percorrendo os elementos por posição do array
		for (int pos = 0; pos < notas.length; pos++) {
			System.out.println("Nota "+ (pos + 1) + " é igual a " + notas[pos]);
		} */
		 
		

	}

}
