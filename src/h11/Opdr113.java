package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdr113 extends Applet {
    public void init() {

    }
    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int num1;
        int num2;
        num1 = 0;
        num2 = 1;
        int uitkomst = 0;
        for(teller = 0; teller < 15; teller++) {
            int optelling;
            optelling = num1 + num2;
            y += 20;
            num1 = num2;
            num2 = optelling;
            uitkomst = num2;
            g.drawString("" + uitkomst, 50, y);
        }
    }
}
