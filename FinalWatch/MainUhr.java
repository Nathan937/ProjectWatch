package FinalWatch;
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
	static String ID = "Europe/Paris";
	
	static JFrame frame;
	static JMenuBar menu;
	static JMenu analogUhr;
	static JMenuItem analoguhr;
	static JMenu digitalUhr;
	
	static JMenuItem digitaluhr24;
	
	
	static JMenuItem mehrereDigitaleuhren;
	static JMenuItem mehrereDigitaleuhren2;
	static JMenu mehrereDigitaleUhren;
	static JMenuItem digitalUhrZeit;
	static JMenuItem beendenItem;
	
	static JMenu ZeitZone;
	static JMenuItem ZeitZoneParis;
	static JMenuItem ZeitZoneLondon;
	static JMenuItem ZeitZoneLosAngeles;
	static JMenuItem ZeitZoneNewYork;
	static JMenuItem ZeitZoneTokyo;
	static JMenuItem ZeitZoneShangai;
	static JMenuItem ZeitZoneBerlin;
	static JMenuItem ZeitZoneSydney;
	static JMenuItem ZeitZoneSaoPaulo;

	public static void menu() {
		beendenItem = new JMenuItem("Exit");
		menu = new JMenuBar();
		analogUhr = new JMenu("Analog Watch");
		analoguhr = new JMenuItem("Analog Watch");
		digitalUhr = new JMenu("Digital Watch");
		digitaluhr24 = new JMenuItem("Digital Watch 24");
		
		mehrereDigitaleUhren = new JMenu("Dynamic Watches");
		mehrereDigitaleuhren = new JMenuItem("1 watch");
		mehrereDigitaleuhren2 = new JMenuItem("2 watches");
		ZeitZone = new JMenu("Timezone");
		//rajouter ici les autres fuseaux horraires
		ZeitZoneParis = new JMenuItem("Paris");
		ZeitZoneLondon = new JMenuItem("London");
		ZeitZoneLosAngeles = new JMenuItem("Los Angeles");
		ZeitZoneNewYork = new JMenuItem("New York");
		ZeitZoneTokyo = new JMenuItem("Tokyo");
		ZeitZoneShangai = new JMenuItem("Shangai");
		ZeitZoneBerlin = new JMenuItem("Berlin");
		ZeitZoneSydney = new JMenuItem("Sydney");
		ZeitZoneSaoPaulo = new JMenuItem("Sao Paulo");
		
		

		menu.add(beendenItem);
		frame.setJMenuBar(menu);
		menu.add(analogUhr);
		menu.add(digitalUhr);
		menu.add(mehrereDigitaleUhren);
		analogUhr.add(analoguhr);
		digitalUhr.add(digitaluhr24);
		
		mehrereDigitaleUhren.add(mehrereDigitaleuhren);
		mehrereDigitaleUhren.add(mehrereDigitaleuhren2);
		menu.add(ZeitZone);
		// copier cette ligne avec le nom de la ville 
		ZeitZone.add(ZeitZoneParis);
		ZeitZone.add(ZeitZoneLondon);
		ZeitZone.add(ZeitZoneLosAngeles);
		ZeitZone.add(ZeitZoneNewYork);
		ZeitZone.add(ZeitZoneShangai);
		ZeitZone.add(ZeitZoneBerlin);
		ZeitZone.add(ZeitZoneSydney);
		ZeitZone.add(ZeitZoneSaoPaulo);
		
		
	}

	public static void fenster() {
		frame = new JFrame("Main Project Watch");
		frame.setBounds(100, 100, 400, 300);
		
		

	}
	public static void Beenden() {
	beendenItem.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Beenden geklickt");
			System.exit(0);
		}});
	}

	// montre digitale 
	
	

	public static void ListenerDigitalUhr() {

		digitaluhr24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("New DigitalWatch is coming");
				
				System.out.println("Mode:"+mode);
				Stop();
				mode[0]=true;
				new DigitalWatch3(frame,ID);
				
				
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
			
				new Analogwatch(frame,ID);
				
				

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
				setTimeZone("Europe/Paris");
				
				
			}
		
		});
		
		ZeitZoneLondon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone London is comming");
				setTimeZone("Europe/London");
				
				
			}
		
		});
		
		ZeitZoneLosAngeles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone LosAngeles is comming");
				setTimeZone("America/Los_Angeles");
				
				
			}
		
		});
		
		ZeitZoneNewYork.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone New York is comming");
				setTimeZone("America/New_York");
				
				
				
			}
		
		});
		
		ZeitZoneTokyo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Tokyo is comming");
				setTimeZone("Asia/Tokyo");
				
				
			}
		
		});
		
		ZeitZoneShangai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Shangai is comming");
				setTimeZone("Asia/Shangai");
				
				
			}
		
		});
		
		ZeitZoneBerlin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Berlin is comming");
				setTimeZone("Europe/Berlin");
				
				
			}
		
		});
		
		ZeitZoneSydney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Sydney is comming");
				setTimeZone("Asia/Sydney");
				
				
			}
		
		});
		
		ZeitZoneSaoPaulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("ZeitZone Sao_Paulo is comming");
				setTimeZone("America/Sao_Paulo");
				
				
			}
		
		});
		
	}

	public static void main(String[] args) {

		fenster();
		menu();
		Beenden();
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
	
	public static void setTimeZone(String temp) {
		if(mode[1]==true) {Analogwatch.setIDAn(temp);
		ID=temp;
		}
		if(mode[0]==true) {DigitalWatch3.clock1.setID(temp);
		ID=temp;
		}
		
}
}
