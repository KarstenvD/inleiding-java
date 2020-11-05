package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht103 extends Applet {
    TextField tekstvak;
    Label label;
    String s, uitkomst, uitkomst2;
    int maand;
    public void init() {
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new Tekstvak());
        label = new Label("Type hier het maandnummer en druk op enter");
        uitkomst = "";
        uitkomst2 = "";
        add(tekstvak);
        add(label);
    }
    public void paint(Graphics g) {
        g.drawString("Maand: " + uitkomst,50,75);
        g.drawString("Dagen: " + uitkomst2,50,100);
    }
    class Tekstvak implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            maand = Integer.parseInt(s);
            switch(maand) {
                case 1:
                    uitkomst = "Januari";
                    uitkomst2 = "31";
                    break;
                case 2:
                    uitkomst = "Februari";
                    uitkomst2 = "28/29";
                    break;
                case 3:
                    uitkomst = "Maart";
                    uitkomst2 = "31";
                    break;
                case 4:
                    uitkomst = "April";
                    uitkomst2 = "30";
                    break;
                case 5:
                    uitkomst = "Mei";
                    uitkomst2 = "31";
                    break;
                case 6:
                    uitkomst = "Juni";
                    uitkomst2 = "30";
                    break;
                case 7:
                    uitkomst = "Juli";
                    uitkomst2 = "31";
                    break;
                case 8:
                    uitkomst = "Augustus";
                    uitkomst2 = "31";
                    break;
                case 9:
                    uitkomst = "September";
                    uitkomst2 = "30";
                    break;
                case 10:
                    uitkomst = "Oktober";
                    uitkomst2 = "31";
                    break;
                case 11:
                    uitkomst = "November";
                    uitkomst2 = "30";
                    break;
                case 12:
                    uitkomst = "December";
                    uitkomst2 = "31";
                    break;
                default:
                    uitkomst = "Je typte een verkeerd nummer in";
                    uitkomst2 = "Je typte een verkeerd nummer in";

            }
            repaint();
        }
    }
}
