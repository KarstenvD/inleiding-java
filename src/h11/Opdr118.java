package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr118 extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        int teller;
        int w, h, x, y, w2, h2, x2, y2;
        w = 10;
        h = 10;
        x = 50;
        y = 50;
        for (teller = 0; teller < 10; teller++) {
            w += 30;
            h += 30;
            g.drawOval(x, y, w, h);
        }
    }
}
