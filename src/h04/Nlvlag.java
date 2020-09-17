package h04;

import java.applet.Applet;
import java.awt.*;

public class Nlvlag extends Applet {
    public void init() {
}
public void paint(Graphics g) {
 g.drawRect(50,50,135,35);
 g.setColor(Color.red);
 g.fillRect(50,50,135,35);
 g.setColor(Color.white);
 g.drawRect(50,85,135,35);
 g.fillRect(50,85,135,35);
 g.setColor(Color.blue);
 g.drawRect(50,120,135,35);
 g.fillRect(50,120,135,35);
 g.setColor(Color.black);
 g.drawLine(50,50,50,250);
 g.drawRect(50,50,135,105);
    }
}




