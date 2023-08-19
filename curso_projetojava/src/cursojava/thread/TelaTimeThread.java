package cursojava.thread;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());

	private JLabel descricaoHora = new JLabel("Nome");
	private JTextField mostraTempo = new JTextField();
	private JLabel descricaoHora2 = new JLabel("Email");
	private JTextField mostraTempo2 = new JTextField();

	private JButton jButtonStart = new JButton("Add lista");
	private JButton jButtonStop = new JButton("Stop");
	
	private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

	
	
	public TelaTimeThread() {
		setTitle("Minha tela de tempo com threads");
		setSize(new Dimension(240, 240));
		setLocationRelativeTo(null);
		setResizable(false);

		/* Gerenciador de posicionamento de componentes na tela */
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		descricaoHora.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricaoHora, gridBagConstraints);

		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		
		jPanel.add(mostraTempo, gridBagConstraints);

		descricaoHora2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricaoHora2, gridBagConstraints);

		mostraTempo2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		
		jPanel.add(mostraTempo2, gridBagConstraints);

		/* a largura volta a valer 1 para poder caber os 2 botões na tela */
		gridBagConstraints.gridwidth = 1;

		jButtonStart.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy++;
		jPanel.add(jButtonStart, gridBagConstraints);

		jButtonStop.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx++;
		jPanel.add(jButtonStop, gridBagConstraints);

		jButtonStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(fila == null) {
					fila = new ImplementacaoFilaThread();
					fila.start();
				}
				
				for(int qtd = 0; qtd < 100; qtd++) {
					ObjetoFilaThread filaThread = new ObjetoFilaThread();
					filaThread.setNome(mostraTempo.getText()+" - " + qtd);
					filaThread.setEmail(mostraTempo2.getText() + " - "+ qtd);
					
					fila.add(filaThread);
				}
				
				
				
				
				System.out.println("Adicionado com sucesso");
			}
		});

		jButtonStop.addActionListener(new ActionListener() {

			
			@Override
			public void actionPerformed(ActionEvent e) {

				fila.stop();
				fila = null;
			
			}
		});
		
		
		fila.start();
		add(jPanel, BorderLayout.WEST);
		setVisible(true);/* Torna a tela visivel, sempre será o ultimo comando */
	}

}
