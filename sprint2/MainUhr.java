import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MainUhr {
	static JFrame frame;
	static JMenuBar menu;
	static JMenu analogUhr;
	static JMenuItem analoguhr;
	static JMenu digitalUhr;
	static JMenuItem digitaluhr;
	static JMenuItem mehrereDigitaleuhren;
	static JMenu mehrereDigitaleUhren;
	static JMenuItem digitalUhrZeit;

	public static void menu() {
		menu = new JMenuBar();
		analogUhr = new JMenu("Analog Uhr");
		analoguhr = new JMenuItem("Analog Uhr");
		digitalUhr = new JMenu("Digital Uhr");
		digitaluhr = new JMenuItem("Digital Uhr");
		mehrereDigitaleUhren = new JMenu("Mehrere Digitale Uhren");
		mehrereDigitaleuhren = new JMenuItem("Mehrere Digitale Uhren");

		frame.setJMenuBar(menu);
		menu.add(analogUhr);
		menu.add(digitalUhr);
		menu.add(mehrereDigitaleUhren);
		analogUhr.add(analoguhr);
		mehrereDigitaleUhren.add(mehrereDigitaleuhren);
		digitalUhr.add(digitaluhr);
	}

	public static void fenster() {
		frame = new JFrame("Main Project Watch");
		frame.setBounds(100, 100, 400, 300);
		

	}

	// montre digitale 
    public static void ListenerDigitalUhr() {

		digitaluhr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("New DigitalWatch is coming");
				new DigitalWatch3();
				
			}
		});

	}

	// montre analogue
	public static void ListenerAnalogWatch() {

		analoguhr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("New AnalogWatch is coming");

				// remplacer ici le nombre Analowatchx() ( x allant de 0 à 4 )
				new Analogwatch();

			}
		});

	}

	public static void main(String[] args) {

		fenster();
		menu();
		ListenerDigitalUhr();
		ListenerAnalogWatch();
		// ListenerMehrereDigitaleUhren();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

}
