package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr116 extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        int teller;
        int w, h, x, y, w2, h2, x2, y2;
        w = 10;
        h = 10;
        x = 950;
        y = 530;
        w2 = 10;
        h2 = 10;
        x2 = 950;
        y2 = 530;
        for (teller = 0; teller < 50; teller++) {
            w += 10;
            h += 10;
            x -= 5;
            y -= 5;
            g.setColor(Color.red);
            g.drawOval(x, y, w, h);
        }
        for (teller = 0; teller < 16; teller++) {
            w2 += 30;
            h2 += 30;
            x2 -= 15;
            y2 -= 15;
            g.setColor(Color.black);
            g.drawOval(x2, y2, w2, h2);
        }
    }
}
