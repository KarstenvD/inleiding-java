package h04;

import java.applet.Applet;
import java.awt.*;

public class Stoplight extends Applet {
    public void init(){
    }
    public void paint(Graphics g) {
        // Stoplight base
        g.setColor(Color.lightGray);
        g.fillRoundRect(90,90,70,120,30,30);
        g.setColor(Color.black);
        g.drawRoundRect(100,100,50,100,30,30);
        g.fillRoundRect(100,100,50,100,30,30);
        // Lamps
        g.setColor(Color.red);
        g.fillOval(116,110,18,18);
        g.setColor(Color.orange);
        g.fillOval(116,143,18,18);
        g.setColor(Color.green);
        g.fillOval(116,176,18,18);
        // Post
        g.setColor(Color.gray);
        g.fillRect(120,210,10,100);
        g.setColor(Color.red);
        g.fillRect(120,220,10,8);
        g.fillRect(120,250,10,8);
        g.fillRect(120,280,10,8);
        g.setColor(Color.black);
        g.drawRect(120,210,10,100);
    }
}
