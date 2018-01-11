package OnlyOneWindow;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MainUhr {
	
	static Boolean [] mode= {false,false,false};
	static String ID;
	
	static JFrame frame;
	static JMenuBar menu;
	static JMenu analogUhr;
	static JMenuItem analoguhr;
	static JMenu digitalUhr;
	
	static JMenuItem digitaluhr24;
	static JMenuItem digitaluhr12;
	
	static JMenuItem mehrereDigitaleuhren;
	static JMenuItem mehrereDigitaleuhren2;
	static JMenu mehrereDigitaleUhren;
	static JMenuItem digitalUhrZeit;
	
	static JMenu ZeitZone;
	static JMenuItem ZeitZoneParis;
	static JMenuItem ZeitZoneLondon;
	static JMenuItem ZeitZoneLosAngeles;
	static JMenuItem ZeitZoneNewYork;
	static JMenuItem ZeitZoneTokyo;
	static JMenuItem ZeitZonePekin;
	static JMenuItem ZeitZoneBerlin;
	static JMenuItem ZeitZoneSydney;
	static JMenuItem ZeitZoneSeatle;
	
	
	

	public static void menu() {
		menu = new JMenuBar();
		analogUhr = new JMenu("Analog Uhr");
		analoguhr = new JMenuItem("Analog Uhr");
		digitalUhr = new JMenu("Digital Uhr");
		digitaluhr24 = new JMenuItem("Digital Uhr 24");
		digitaluhr12 = new JMenuItem("Digital Uhr 12");
		mehrereDigitaleUhren = new JMenu("Mehrere Digitale Uhren");
		mehrereDigitaleuhren = new JMenuItem("1 Uhr");
		mehrereDigitaleuhren2 = new JMenuItem("2 Uhren");
		ZeitZone = new JMenu("ZeitZone");
		//rajouter ici les autres fuseaux horraires
		ZeitZoneParis = new JMenuItem("Paris");
		ZeitZoneLondon = new JMenuItem("London");
		ZeitZoneLosAngeles = new JMenuItem("Los Angeles");
		ZeitZoneNewYork = new JMenuItem("New York");
		ZeitZoneTokyo = new JMenuItem("Tokyo");
		ZeitZonePekin = new JMenuItem("Pekin");
		ZeitZoneBerlin = new JMenuItem("Berlin");
		ZeitZoneSydney = new JMenuItem("Sydney");
		ZeitZoneSeatle = new JMenuItem("Seatle");
		
		

		frame.setJMenuBar(menu);
		menu.add(analogUhr);
		menu.add(digitalUhr);
		menu.add(mehrereDigitaleUhren);
		analogUhr.add(analoguhr);
		digitalUhr.add(digitaluhr24);
		digitalUhr.add(digitaluhr12);
		mehrereDigitaleUhren.add(mehrereDigitaleuhren);
		mehrereDigitaleUhren.add(mehrereDigitaleuhren2);
		menu.add(ZeitZone);
		// copier cette ligne avec le nom de la ville 
		ZeitZone.add(ZeitZoneParis);
		ZeitZone.add(ZeitZoneLondon);
		ZeitZone.add(ZeitZoneLosAngeles);
		ZeitZone.add(ZeitZoneNewYork);
		ZeitZone.add(ZeitZonePekin);
		ZeitZone.add(ZeitZoneBerlin);
		ZeitZone.add(ZeitZoneSydney);
		ZeitZone.add(ZeitZoneSeatle);
		
		
	}

	public static void fenster() {
		frame = new JFrame("Main Project Watch");
		frame.setBounds(100, 100, 400, 300);
		
		

	}


	// montre digitale 
	
	

	public static void ListenerDigitalUhr() {

		digitaluhr24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("New DigitalWatch is coming");
				
				System.out.println("Mode:"+mode);
				Stop();
				mode[0]=true;
				new DigitalWatch3(frame);
				
				
			}
		
		});
		
		digitaluhr12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("New DigitalWatch is coming");
				//new DigitalWatch();
				
			}
		
		});

	}

	// montre analogue
	public static void ListenerAnalogWatch() {

		analoguhr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("New AnalogWatch is coming");

				// remplacer ici le nombre Analowatchx() ( x allant de 0 à 4 )
				
				System.out.println("Mode:"+mode);
				Stop();
				mode[1]=true;
			
				new Analogwatch(frame);
				
				

			}
		});

	}
	public static void ListenerMehrereDigitaleUhren() {

		mehrereDigitaleuhren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("New DigitalWatch is coming");
				Stop();
				mode[2]=true;
				
				new DigitalWatch(frame,1);
				
				
			}
		
		});
		
		mehrereDigitaleuhren2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("New DigitalWatch is coming");
				Stop();
				mode[2]=true;
				new DigitalWatch(frame,2);
				
			}
		
		});

	}
	
	public static void ListenerZeitZonen() {
		
		ZeitZoneParis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Paris is comming");
				Stop();
				mode[2]=true;
				
				new DigitalWatch(frame,1);
				
				
			}
		
		});
		
		ZeitZoneLondon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Paris is comming");
				Stop();
				mode[2]=true;
				
				new DigitalWatch(frame,1);
				
				
			}
		
		});
		
		ZeitZoneLosAngeles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Paris is comming");
				Stop();
				mode[2]=true;
				
				new DigitalWatch(frame,1);
				
				
			}
		
		});
		
		ZeitZoneNewYork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Paris is comming");
				Stop();
				mode[2]=true;
				
				new DigitalWatch(frame,1);
				
				
			}
		
		});
		
		ZeitZoneTokyo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Paris is comming");
				Stop();
				mode[2]=true;
				
				new DigitalWatch(frame,1);
				
				
			}
		
		});
		
		ZeitZonePekin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Paris is comming");
				Stop();
				mode[2]=true;
				
				new DigitalWatch(frame,1);
				
				
			}
		
		});
		
		ZeitZoneBerlin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Paris is comming");
				Stop();
				mode[2]=true;
				
				new DigitalWatch(frame,1);
				
				
			}
		
		});
		
		ZeitZoneSydney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Paris is comming");
				Stop();
				mode[2]=true;
				
				new DigitalWatch(frame,1);
				
				
			}
		
		});
		
		ZeitZoneSeatle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Paris is comming");
				Stop();
				mode[2]=true;
				
				new DigitalWatch(frame,1);
				
				
			}
		
		});
		
		
		
		
	}



	public static void main(String[] args) {

		fenster();
		menu();
		ListenerDigitalUhr();
		ListenerAnalogWatch();
		ListenerMehrereDigitaleUhren();
		ListenerZeitZonen();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}

	public static void Stop() {
		
		if(mode[1]==true)Analogwatch.ClockEngine.interrupt();
		if(mode[0]==true)DigitalWatch3.t.stop();
		if(mode[2]==true)
			{DigitalWatch.t.interrupt();
		frame.getContentPane().removeAll();}
		for(int i=0;i<mode.length;i++)mode[i]=false;
	}
}