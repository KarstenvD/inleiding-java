package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr112 extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        int teller;
        int x = 0;
        int nummer = 10;
        for(teller = 0; teller < 10; teller++) {
            x += 20;
            nummer += 1;
            g.drawString("" + nummer, x, 50);
        }
    }
}
