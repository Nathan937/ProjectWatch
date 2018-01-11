import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

public class DigitalWatch3 {

	public DigitalWatch3() {
		JFrame frm = new JFrame();
		
		SimpleDigitalClock clock1 = new SimpleDigitalClock();
		frm.setBackground(Color.YELLOW);
		frm.add(clock1);
		frm.pack();
		frm.setVisible(true);
	}

	static class SimpleDigitalClock extends JPanel {
		String stringTime;
		int hour, minute, second, day, month, year;
		char date;
		String aHour = "";
		String bMinute = "";
		String cSecond = "";
		String dDate = "";
		String eDay = "";
		String fMonth = "";
		String gYear = "";

		public void setStringTime(String abcdefg) {
			this.stringTime = abcdefg;
		}

		public int Number(int a, int b) {
			return (a <= b) ? a : b;
		}

		SimpleDigitalClock() {
			setVisible(true);
			Timer t = new Timer(1000, new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					repaint();
				}
			});
			t.start();
		}

		@Override
		public void paintComponent(Graphics v) {
			super.paintComponent(v);
			Calendar rite = Calendar.getInstance();
			hour = rite.get(Calendar.HOUR_OF_DAY);
			minute = rite.get(Calendar.MINUTE);
			second = rite.get(Calendar.SECOND);
			day = rite.get(Calendar.DATE);
			month = rite.get(Calendar.MONTH) + 1;
			year = rite.get(Calendar.YEAR);
			date = (char) rite.get(Calendar.DATE);

			if (hour < 10) {
				this.aHour = "0";
			}
			if (hour >= 10) {
				this.aHour = "";
			}
			if (minute < 10) {
				this.bMinute = "0";
			}
			if (minute >= 10) {
				this.bMinute = "";
			}
			if (second < 10) {
				this.cSecond = "0";
			}
			if (second >= 10) {
				this.cSecond = "";
			}
			if (day >= 10) {
				this.eDay = "";
			}
			if (day < 10) {
				this.eDay = "0";
			}
			if (month >= 10) {
				this.fMonth = "";
			}
			if (month < 10) {
				this.fMonth = "0";
			}
			setStringTime(aHour + hour + ":" + bMinute + minute + ":" + cSecond + second + "  " + eDay + day + "/"
					+ fMonth + month + "/" + year + date);
			v.setColor(Color.BLACK);
			int length = Number(this.getWidth(), this.getHeight());
			Font Font1 = new Font("SansSerif", Font.PLAIN, length / 5);
			
			v.setFont(Font1);
			v.drawString(stringTime, (int) length / 6, length / 2);
		}

		@Override
		public Dimension getPreferredSize() {
			return new Dimension(420, 200);
		}
	}
}
