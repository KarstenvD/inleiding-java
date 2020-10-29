package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdrzesdrie extends Applet {
    int a;
    int b;
    public void init(){
        a = 5;
        b = 6;
    }
    public void paint(Graphics g) {
        g.drawString("" + (a + -b),50,50);
    }
}
