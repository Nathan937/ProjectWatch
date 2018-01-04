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

		// Men�zeile (JMenuBar) erzeugen und in das Fenster (JFrame) einf�gen
		JMenuBar bar = new JMenuBar();
		frame.setJMenuBar(bar);

		// Men� (JMenu) erzeugen und in die Men�zeile (JMenuBar) einf�gen
		JMenu dateiMenu = new JMenu("Datei");
		bar.add(dateiMenu);

		// Men�eintr�ge (JMenuItem) erzeugen und dem Men� (JMenu) "Datei" hinzuf�gen
		JMenuItem oeffnenItem = new JMenuItem("�ffnen");
		oeffnenItem.addActionListener(e -> {
			System.out.println("�ffnen geklickt");
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