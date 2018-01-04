package Nathan;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar {

	
	private JFrame frame;

	public MenuBar() {
		createFrame();
	}

	private void createFrame() {
		frame = new JFrame("Mein erstes GUI");
		createMenuBar();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();
		frame.setVisible(true);
	}

	private void createMenuBar() {

		// Menüzeile (JMenuBar) erzeugen und in das Fenster (JFrame) einfügen
		JMenuBar bar = new JMenuBar();
		frame.setJMenuBar(bar);

		// Menü (JMenu) erzeugen und in die Menüzeile (JMenuBar) einfügen
		JMenu dateiMenu = new JMenu("Datei");
		bar.add(dateiMenu);

		// Menüeinträge (JMenuItem) erzeugen und dem Menü (JMenu) "Datei" hinzufügen
		JMenuItem oeffnenItem = new JMenuItem("Öffnen");
		oeffnenItem.addActionListener(e -> {
			System.out.println("Öffnen geklickt");
		});
		dateiMenu.add(oeffnenItem);

		JMenuItem beendenItem = new JMenuItem("Beenden");
		beendenItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Beenden geklickt");
				System.exit(0);
			}
		});
		dateiMenu.add(beendenItem);

		JMenu cadransMenu = new JMenu("Nombre de cadrans");
		bar.add(cadransMenu);

		JMenuItem einUhr = new JMenuItem("1");
		einUhr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("New Watch is coming");
				
				new DigitalWatch(frame,1);
			}
		});
		cadransMenu.add(einUhr);

		JMenuItem zweiUhr = new JMenuItem("2");
		zweiUhr.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("New Watch is coming");
				
				new DigitalWatch(frame,2);
				
			}
		});
		cadransMenu.add(zweiUhr);

	}

	public static void main(String[] args) {
		new MenuBar();
	}

}