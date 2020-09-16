package h02;

import java.applet.Applet;
import java.awt.*;

import static java.awt.Color.*;
import static java.awt.Color.yellow;

public class test extends Applet {
    public void init() {
        setBackground(white);
    }

    public void paint(Graphics g) {
        g.setColor(blue);
        g.drawString("Karsten", 50, 60);
        g.setColor(red);
        g.drawString("van Deelen", 95, 60);
    }
}