package OnlyOneWindow;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.*;
import java.util.*;

public class DigitalWatch implements Runnable {
	
	static Thread t = null;
	String timeString = "";

	int hours = 0, minutes = 0, seconds = 0;
	
	
	
	int nT=4;
	JButton montre[] = new JButton[nT];
	final Boolean startstop[]=new Boolean[nT];
	
	
	
	

	public DigitalWatch(JFrame f,int a) {
		
		f.getContentPane().removeAll();
		
		 
		for (int i = 0; i < 4; i++) {montre[i] = new JButton();
		startstop[i]=true;
		}
		
		for ( int i = 0; i < a; i++) {
            montre[i].setBounds(100+i*200, 100, 100, 50);
            f.add(montre[i]);
            final int iTmp = i;
            montre[i].addActionListener(new ActionListener() {

            	

				public void actionPerformed(ActionEvent e) {
            		startstop[iTmp]=!startstop[iTmp];
            		
    			}
        });
		}

		t = new Thread(this);
		t.start();
		
		
		f.setSize(300+200*a, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	@SuppressWarnings("deprecation")
	public void run() {
		try {
			while (true) {

				Calendar cal = Calendar.getInstance();
				hours = cal.get(Calendar.HOUR_OF_DAY);
				if (hours > 12)
					hours -= 12;
				minutes = cal.get(Calendar.MINUTE);
				seconds = cal.get(Calendar.SECOND);

				SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");
				Date date = cal.getTime();
				timeString = formatter.format(date);

				printTime();
System.out.println("C");
				t.sleep(1000);
				
				
			}
		} catch (Exception e) {
		}
	}

	public void printTime() {
		for(int i=0;i<4;i++) {
			if(startstop[i]==true)montre[i].setText(timeString);
			
			}
	
	}
	
}