package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdr131 extends Applet {

    public void init() {

    }
    public void paint(Graphics g) {
        tekenDriehoek(g, 10, 10, 50, 10, 25, 100);
    }
    void tekenDriehoek(Graphics g, int x, int y ,int x2 ,int y2, int x3 ,int y3 ) {
        g.drawLine(x, y, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x, y);
    }
}