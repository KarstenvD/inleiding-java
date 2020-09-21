package h04;

import java.applet.Applet;
import java.awt.*;

public class Sunset extends Applet {
    public void init(){
        setSize(1000,1000);
    }
    public void paint(Graphics g) {
        setBackground(Color.cyan);
        // Zand
        g.setColor(Color.orange);
        g.fillRect(0,600,1000,400);
        // Water
        g.setColor(Color.BLUE);
        g.fillRect(0,600,1000,125);
        // Zon
        g.setColor(Color.yellow);
        g.drawArc(350,450,300,300,0,180);
        g.fillArc(350,450,300,300,0,180);

    }
}
