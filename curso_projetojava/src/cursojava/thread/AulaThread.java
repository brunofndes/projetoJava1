package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		
		new Thread() {
			public void run() {
				for(int pos = 0; pos < 10; pos++) {	
					/**/
					System.out.println("Executando alguma rotina");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		}.start();
		
		System.out.println("Alguma coisa fora da thread");
		JOptionPane.showMessageDialog(null, "Rodando fora da rotina da thread");
		
		

	}

}
