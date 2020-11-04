package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr101 extends Applet {
    TextField vak;
    Double uitkomst;
    Double uitkomst2;
    Double nummer;
    String uitkomstfinal;
    public void init() {
        vak = new TextField("",20);
        vak.addActionListener(new Vak());
        add(vak);
        uitkomst = 0.0;
        uitkomst2 = 0.0;
    }
    public void paint(Graphics g) {
        g.drawString("je hoogste getal is: " + uitkomst,50,50);
        g.drawString("je laagste getal is: " + uitkomst2,50,100);
    }
    class Vak implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = vak.getText();
            nummer = Double.parseDouble(s);
            if(nummer > uitkomst ) {
                uitkomst = nummer;
            }
            if(uitkomst2 == 0.0) {
                uitkomst2 = nummer;
            }
            if(nummer < uitkomst2) {
                uitkomst2 = nummer;
            }
            repaint();
        }
    }
}

