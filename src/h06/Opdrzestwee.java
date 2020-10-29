package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdrzestwee extends Applet {
    int a;
    int b;
    int c;

public void init() {
    a = 60;
    b = 24;
    c = 365;
}
public void paint(Graphics g) {
    g.drawString("seconde in 1 uur: " + a*60,50,50);
    g.drawString("seconde in een dag: " + b*60*60,50,75);
    g.drawString("seconde in een jaar: " + c*b*60*60,50,100);
}
}

