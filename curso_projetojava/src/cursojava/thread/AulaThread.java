package cursojava.thread;

import javax.swing.JOptionPane;

public class AulaThread {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		Thread threadNFCE = new Thread(thread2);
		threadNFCE.start();
		
		System.out.println("Alguma coisa fora da thread");
		JOptionPane.showMessageDialog(null, "Rodando fora da rotina da thread");		
		
	}
	
	 private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int pos = 0; pos < 10; pos++) {	
				/**/
				System.out.println("Executando email de uma crontab para diferenciação");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int pos = 0; pos < 10; pos++) {	
				/**/
				System.out.println("Executando uma rotina para nota fiscal");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	};

}
