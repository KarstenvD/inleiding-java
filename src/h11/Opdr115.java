package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr115 extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        int teller;
        int x;
        int y;
        x = 50;
        y = 50;
        for(teller = 0; teller < 5; teller++) {
            x += 25;
            y += 25;
            g.drawRect(x, y,25,25);
        }
    }
}
