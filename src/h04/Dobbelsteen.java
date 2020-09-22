package h04;

import java.applet.Applet;
import java.awt.*;

public class Dobbelsteen extends Applet {
    public void init() {
        setSize(200,200);
    }
    public void paint(Graphics g) {
        // Dobbelsteen
        g.drawRoundRect(50,50,100,100,10,10);
        // Puntje
        g.fillOval(66,66,22,22);
        g.fillOval(111,66,22,22);
        g.fillOval(66,111,22,22);
        g.fillOval(111,111,22,22);
    }
}
