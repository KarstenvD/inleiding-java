package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr124 extends Applet {
    int[] getallen = {100, 300, 452, 213, 60, 23, 439, 975};
    TextField tekstvak;
    boolean gevonden;
    public void init() {
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new Tekstvak());
        add(tekstvak);
    }
    public void paint(Graphics g) {
        int y = 50;
        for(int teller = 0; teller < getallen.length; teller++) {
            y += 15;
            g.drawString("" + getallen[teller], 50, y);
        }
    }
    class Tekstvak implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}
