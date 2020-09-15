package h04;

import java.applet.Applet;
import java.awt.*;

public class hfdstuk4 extends Applet {
    public void init() {
}
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawLine(200,100, 300, 200);
        g.drawLine(200,100,100, 200);
        g.drawLine(100,200,300,200);

    }
}