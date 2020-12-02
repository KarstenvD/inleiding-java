package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr124 extends Applet {
    int[] getallen = {100, 300, 452, 213, 60, 23, 439, 975};
    TextField tekstvak;
    boolean gevonden;
    int gezocht;
    int text;
    String awnser;
    String awnser2;
    public void init() {
        awnser = "";
        awnser2 = "";
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
        g.drawString("" + awnser + awnser2, 100, 100);
    }
    class Tekstvak implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gezocht = Integer.parseInt(tekstvak.getText());
            gevonden = false;
            for (int teller = 0; teller < getallen.length; teller++) {
                if(getallen[teller] == gezocht) {
                    gevonden = true;
                    text = teller;
                }
            }
            if(gevonden == true) {
                awnser = "Het getal is gevonden ";
                awnser2 = "De index is: " + text;
            }
            else {
                awnser = "Het getal is niet gevonden ";
                awnser2 = "";
            }

            repaint();
        }
    }
}
