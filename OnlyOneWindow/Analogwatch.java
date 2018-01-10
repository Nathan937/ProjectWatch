package OnlyOneWindow;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Analogwatch implements Runnable{


    public int hour;
    public int min;
    public int sec;
    static Thread ClockEngine=null;
     ClockDial cd;
    String timeString = "";
    String ID ="Africa/Addis_Ababa";

    public Analogwatch(JFrame f) {
    	
    	f.getContentPane().removeAll();
        f.setSize(510,530);
        cd=new ClockDial(this);
        f.add(cd);
        
       
        
        ClockEngine= new Thread(this);
        ClockEngine.start();
        f.setVisible(true);
    }

/*public static void main(String args[]) {
                new Analogwatch4().setVisible(true);
    }*/



@SuppressWarnings("deprecation")
public void run() {
	try {
		while (true) {

			
			DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			
			dfm.setTimeZone(TimeZone.getTimeZone(ID));
			
			Date date = cal.getTime();
			Date a = dfm.parse(dfm.format(date));
			timeString = dfm.format(a);
			
			String [] don=timeString.split(" |:");
			hour=Integer.parseInt(don[1]);
			min=Integer.parseInt(don[2]);
			sec=Integer.parseInt(don[3]);
			
			cd.repaint();
			
			System.out.println("A");
			

			ClockEngine.sleep(1000);
			
		}
	} catch (InterruptedException ex) {

        Thread.currentThread().interrupt(); // Très important de réinterrompre
        

	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} }
}


class ClockDial extends JPanel{

	Analogwatch parent;
    public ClockDial(Analogwatch pt){
        setSize(1000,1000);
        parent=pt;
    }

   
    @Override
 public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.WHITE);
        g.fillOval(5, 5,480,480);
        g.setColor(Color.BLACK);
        g.fillOval(10, 10,470,470);
        g.setColor(Color.WHITE);
        g.fillOval(237,237,15,15);
        g.setFont(g.getFont().deriveFont(Font.BOLD,32));

        for(int i=1;i<=12;i++)
            g.drawString(Integer.toString(i),240-(i/12)*11+(int)(210*Math.sin(i*Math.PI/6)),253-(int)(210*Math.cos(i*Math.PI/6)));

        
        
        double minsecdeg=(double)Math.PI/30;
        double hrdeg=(double)Math.PI/6;
        int tx,ty;
        int xpoints[]=new int[3];
        int ypoints[]=new int[3];
 
       //second hand
        tx=245+(int)(210*Math.sin(parent.sec*minsecdeg));
        ty=245-(int)(210*Math.cos(parent.sec*minsecdeg));
        g.drawLine(245,245,tx,ty);

        //minute hand
        tx=245+(int)(190*Math.sin(parent.min*minsecdeg));
        ty=245-(int)(190*Math.cos(parent.min*minsecdeg));
        xpoints[0]=245;
        xpoints[1]=tx+2;
        xpoints[2]=tx-2;
        ypoints[0]=245;
        ypoints[1]=ty+2;
        ypoints[2]=ty-2;
        g.fillPolygon(xpoints, ypoints,3);

        //hour hand
        tx=245+(int)(160*Math.sin(parent.hour*hrdeg+parent.min*Math.PI/360));
        ty=245-(int)(160*Math.cos(parent.hour*hrdeg+parent.min*Math.PI/360));
        xpoints[1]=tx+4;
        xpoints[2]=tx-4;
        ypoints[1]=ty-4;
        ypoints[2]=ty+4;
        g.fillPolygon(xpoints, ypoints, 3);

    }

}