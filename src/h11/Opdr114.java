package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr114 extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int num;
        num = 0;
        int uitkomst = 0;
        for(teller = 0; teller < 15; teller++) {
            y += 20;
            num += 1;
            uitkomst = num * 3;
            g.drawString("" + uitkomst, 50, y);
        }
    }
}
