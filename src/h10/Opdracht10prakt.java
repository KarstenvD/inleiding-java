package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht10prakt extends Applet {
    TextField tekstvak;
    Label label;
    String voldoendes, onvoldoendes, gemiddelde, rating;
    Double cijfer, gemiddeldeant, totaal;
    int teller;
    public void init() {
        teller = 0;
        voldoendes = "Voldoendes ";
        onvoldoendes = "Onvoldoendes ";
        gemiddelde = "Gemiddelde: ";
        rating = "";
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
        g.drawString("Je gemiddelde: " + gemiddeldeant,50,125);
        g.drawRect(150,150,145,50);
        g.drawString("Je cijfer is: " + rating,155,175);
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
                if(cijfer >= 0.1) {
                    onvoldoendes += (", " + cijfer);
                }
            }
            if(cijfer >= 0.1) {
                if(cijfer <= 10) {
                    teller++;
                    totaal += cijfer;
                    gemiddeldeant = totaal / teller;
                }
                if(cijfer < 4) {
                    rating = "slecht";
                }
                if(cijfer >= 4) {
                    if(cijfer < 5) {
                        rating = "onvoldoende";
                    }
                }
                if(cijfer >= 5) {
                   if ( cijfer < 6) {
                       rating = "matig";
                   }
                }
                if(cijfer >= 6) {
                    if(cijfer < 8) {
                        rating = "voldoende";
                    }
                }
                if(cijfer >= 8) {
                    if(cijfer <=10) {
                        rating = "goed";
                    }
                }
                if(cijfer < 0) {
                    rating = "ongeldig";
                }
                if(cijfer > 10) {
                    rating = "ongeldig";
                }
            }
            repaint();
        }
    }
}
