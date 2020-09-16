package h04;

import java.applet.Applet;
import java.awt.*;

public class huis extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(150, 100, 100,100);
        g.drawRect(160,115,28,28);
        g.drawRoundRect(210,135,30,65,5,5);
        g.drawOval(215,160,3,3);
        g.fillOval(215,160,3,3);
        g.drawLine(200,50, 250, 100);
        g.drawLine(200,50,150, 100);
    }
}


