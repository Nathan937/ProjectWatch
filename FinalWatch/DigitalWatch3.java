package FinalWatch;
import java.awt.*;

import java.util.*;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.Timer;
import java.awt.event.ActionEvent;

public class DigitalWatch3 {
	static SimpleDigitalClock clock1;
	static Timer t=null;
	public DigitalWatch3(JFrame frm, String ID) {
		
		
		frm.getContentPane().removeAll();
		frm.setSize(510,530);
		clock1 = new SimpleDigitalClock(this);
		frm.add(clock1);
		
		clock1.setID(ID);
		
		t = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				clock1.repaint();
				System.out.println("D");
			}
		});
		
		t.start();
		frm.setVisible(true);
	}


	static class SimpleDigitalClock extends JPanel {
		
		String stringTime,stringTime2;
		
		String timeString="";
		String ID;
		
		DigitalWatch3 parent;
		
	    public SimpleDigitalClock(DigitalWatch3 pt){
	    	setSize(520,530);
	        parent=pt;
	    }

		public void setStringTime2(String abcdefg) {
			this.stringTime2 = abcdefg;
		}
		
		public void setID(String abcdefg) {
			this.ID = abcdefg;
		}
		
		public void setStringTime(String abcdefg) {
			this.stringTime = abcdefg;
		}

		public int Number(int a, int b) {
			return (a <= b) ? a : b;
		}

		

		@Override
		public void paintComponent(Graphics v) {
			super.paintComponent(v);
			DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			
			dfm.setTimeZone(TimeZone.getTimeZone(ID));
			
			Date date = cal.getTime();
			Date a;
			try {
				a = dfm.parse(dfm.format(date));
				timeString = dfm.format(a);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String[] morc= timeString.split(" ");
			setStringTime(morc[0]);
			setStringTime2(morc[1]);
			
			v.setColor(Color.BLACK);
			
			Font Font1 = new Font("SansSerif", Font.PLAIN, 20);
			
			v.setFont(Font1);
			v.drawString(stringTime, 50, 100);
			v.drawString(stringTime2, 50, 150);
			v.drawString(ID, 50, 200);
		}

	
	}
}