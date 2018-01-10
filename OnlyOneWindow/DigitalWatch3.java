package OnlyOneWindow;
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
	
	public DigitalWatch3(JFrame frm) {
		
		
		
		clock1 = new SimpleDigitalClock();
		frm.setBackground(Color.YELLOW);
		
		
		frm.add(clock1);
		frm.pack();
		frm.setVisible(true);
	}


	static class SimpleDigitalClock extends JPanel {
		Timer t=null;
		String stringTime,stringTime2;
		
		String timeString="";
		String ID ="Africa/Addis_Ababa";

		public void setStringTime2(String abcdefg) {
			this.stringTime2 = abcdefg;
		}
		
		public void setStringTime(String abcdefg) {
			this.stringTime = abcdefg;
		}

		public int Number(int a, int b) {
			return (a <= b) ? a : b;
		}

		SimpleDigitalClock() {
			setVisible(true);
			t = new Timer(1000, new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					repaint();
					
				}
			});
			t.start();
			
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
			int length = Number(this.getWidth(), this.getHeight());
			Font Font1 = new Font("SansSerif", Font.PLAIN, length / 5);
			
			v.setFont(Font1);
			v.drawString(stringTime, 50, 100);
			v.drawString(stringTime2, 50, 150);
			v.drawString(ID, 50, 200);
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(420, 200);
		}
	}
}