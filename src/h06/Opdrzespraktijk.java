package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdrzespraktijk extends Applet {
    float a, b, c, d, uitkomst;

    public void init(){
        a = 5.9f;
        b = 6.3f;
        c = 6.9f;
        d = ((a+b+c) / 3);
        d *= 10;
        d = (int) d;
        d /= 10;
        uitkomst = d;
    }
    public void paint(Graphics g) {
        g.drawString("het gemiddelde is: " + uitkomst,50,50);
        g.drawString("test nummer: " + d,50,75);
    }
}
