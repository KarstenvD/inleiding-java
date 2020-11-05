package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht105 extends Applet {
    TextField tekstvak;
    Label label;
    String voldoendes, onvoldoendes, gemiddelde;
    Double cijfer, gemiddeldeant, totaal;
    int teller;
    public void init() {
        teller = 0;
        voldoendes = "Voldoendes ";
        onvoldoendes = "Onvoldoendes ";
        gemiddelde = "Gemiddelde: ";
        gemiddeldeant = 0.0;
        totaal = 0.0;
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new Tekstvak());
        label = new Label("type hier je gehaalde cijfer in");
        add(tekstvak);

    }
    public void paint(Graphics g) {
        g.drawString(voldoendes,50,75);
        g.drawString(onvoldoendes,50,100);
        g.drawString("" + gemiddeldeant,50,125);
    }
    class Tekstvak implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            cijfer = Double.parseDouble(s);

            if (cijfer >= 5.5) {
                if(cijfer <= 10) {
                    voldoendes += (", " + cijfer);
                }
            }
            if(cijfer < 5.5) {
                onvoldoendes += (", " + cijfer);
            }
            if(cijfer > 0) {
                if(cijfer <= 10) {
                    teller++;
                    totaal += cijfer;
                    gemiddeldeant = totaal / teller;
                }
            }
            repaint();
        }
    }
}
