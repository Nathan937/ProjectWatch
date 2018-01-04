

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Analogwatch4 extends javax.swing.JFrame {


    public int hour;
    public int min;
    public int sec;
    ClockDial cd;

    public Analogwatch4() {
        setSize(510,530);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cd=new ClockDial(this);
        getContentPane().add(cd);
        Date curr=new Date();
        String time=curr.toString();
        hour=Integer.parseInt(time.substring(11,13));
        min=Integer.parseInt(time.substring(14,16));
        sec=Integer.parseInt(time.substring(17,19));
        ClockEngine.setPriority(ClockEngine.getPriority()+3);
        ClockEngine.start();
    }

/*public static void main(String args[]) {
                new AnalogWatch4().setVisible(true);
    }*/

Thread ClockEngine=new Thread()

{
int newsec,newmin;

public void run()
  {
  while(true)
    {
    newsec=(sec+1)%60;
    newmin=(min+(sec+1)/60)%60;
    hour=(hour+(min+(sec+1)/60)/60)%12;
    sec=newsec;
    min=newmin;

    try {

          Thread.sleep(1000);

      } catch (InterruptedException ex) {}

    cd.repaint();
    }
}
};
}


class ClockDial extends JPanel{

	Analogwatch4 parent;
    public ClockDial(Analogwatch4 pt){
        setSize(520,530);
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