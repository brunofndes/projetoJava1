package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ImplementacaoFilaThread extends Thread {

	private static ConcurrentLinkedDeque<ObjetoFilaThread> pilha_fila = new ConcurrentLinkedDeque<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}

	@Override
	public void run() {

		System.out.println("filaa rodando");

		
		while (true) {
			
			
			synchronized (pilha_fila) {/* Bloquea o processo, só é acessado quando o processo termina */
				Iterator iteracao = pilha_fila.iterator();
				while (iteracao.hasNext()) { /* Vai processar enquanto possuir dados na lista */

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();/* Pega o objeto atual */

					/* Lógica da rotina do processo */
					System.out.println("===============================================");

					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());

					iteracao.remove();
					try {
						Thread.sleep(100);/* Dar um tempo para descarga de memoria */
					} catch (Exception e) {
						e.printStackTrace();
					}

				}

			}
			
			try {
				Thread.sleep(100);/*Outro tempo para limpar a memória*/
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
