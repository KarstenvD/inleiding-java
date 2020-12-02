package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr126 extends Applet {
    int[] getallen = {300, 300, 300, 213, 60, 23, 23, 975};
    TextField tekstvak;
    boolean gevonden;
    int gezocht;
    int voorkom;
    public void init() {
        gevonden = false;
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
            g.drawString(gezocht + " komt " + voorkom + " keer voor.", 100, 125);
    }
    class Tekstvak implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            voorkom = 0;
            gezocht = Integer.parseInt(tekstvak.getText());
            gevonden = false;
            for (int teller = 0; teller < getallen.length; teller++) {
                if(getallen[teller] == gezocht) {
                    gevonden = true; voorkom++;
                }
            }
            repaint();
        }
    }
}
