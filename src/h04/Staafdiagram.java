package h04;

import java.applet.Applet;
import java.awt.*;

public class Staafdiagram extends Applet {
    public void init() {
}
public void paint(Graphics g) {
    // Cijfers linkerkant
    g.drawString("0", 50, 200);
    g.drawString("20", 50, 180);
    g.drawString("40", 50, 160);
    g.drawString("60", 50, 140);
    g.drawString("80", 50, 120);
    g.drawString("100", 50, 100);

    // Balken
    // Balk Jeroen
    g.setColor(Color.blue);
    g.fillRect(75, 95, 10, 105);
    // Balk Hans
    g.setColor(Color.orange);
    g.fillRect(95, 115, 10, 85);
    // Balk Valerie
    g.setColor(Color.red);
    g.fillRect(115, 155, 10, 45);

    // Namen
    // Naam Jeroen
    g.setColor(Color.blue);
    g.drawString("Jeroen", 40, 210);
    // Naam Hans
    g.setColor(Color.orange);
    g.drawString("Hans",80,210);
    // Naam Valerie
    g.setColor(Color.red);
    g.drawString("Valerie",115,210);
}

}

