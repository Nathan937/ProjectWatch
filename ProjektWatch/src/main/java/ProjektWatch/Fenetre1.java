package ProjektWatch;




import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Fenetre1 {

	//Declaration de la fenetre
	
	private JFrame frame;

	
	//Appel de la fenetre
	
	public Fenetre1() {
		createFrame();
	}

	
	private void createFrame() {
		
		//Declaration avec nom de la fenetre
		frame = new JFrame("Fenetre1");
		
		// Appel de la barre de menu
		createMenuBar();

		//configuration du bouton quitter la fenetre X
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// On declare un object Container (contenu de la fenetre)
		Container contentPane = frame.getContentPane();

		
		// Declaration d'un objet JButton
		final JButton button = new JButton("Start");
		//Action du bouton défini
		button.addActionListener(actionEvent -> button.setText("Stop"));
		contentPane.add(button);
        
		//????????????
		frame.pack();
		
		
		//rend la fenetre visible (TOUJOURS TRUE)
		frame.setVisible(true);
	}

	private void createMenuBar() {

		
		// Declare et ajoute une barre de menu a la fenetre
		JMenuBar bar = new JMenuBar();
		frame.setJMenuBar(bar);

		
		// Declare et ajoute dans la barre de menu un onglet
		JMenu dateiMenu = new JMenu("Fichier");
		bar.add(dateiMenu);

		
		// Declare et ajoute dans un onglet une option
		JMenuItem oeffnenItem = new JMenuItem("Ouvrir");
		// Action de l'option
		oeffnenItem.addActionListener(e -> {
			System.out.println("Vous avez appuyé sur ouvrir");
		});
		dateiMenu.add(oeffnenItem);

		
		// Meme operation (Synthaxe differente sur l'action)
		
		JMenuItem beendenItem = new JMenuItem("Terminer");
		beendenItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Vous avez appuyé sur terminer");
				System.exit(0);
			}
		});
		dateiMenu.add(beendenItem);

	}

	
	public static void main(String[] args) {
		
		//Demarrage de la fenetre
		new Fenetre1().createFrame();
	}


}
