package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk112 extends Applet {
    Button knop;
    Button knop2;
    int tafel;

    public void init() {
        knop = new Button("vorige");
        knop.addActionListener(new Knopterug());
        knop2 = new Button("volgende");
        knop2.addActionListener(new Knop());
        add(knop);
        add(knop2);
    }

    public void paint(Graphics g) {
        int teller;
        int y = 50;
        int x = 125;
        int num;
        num = 0;
        int uitkomst = 0;
        for (teller = 0; teller < 10; teller++) {
            y += 20;
            num += 1;
            uitkomst = num * tafel;
            g.drawString("" + num + " x " + tafel + " = " + uitkomst, x, y);
            if (teller == 4) {
                x = 200;
                y = 50;
            }
        }
        g.drawRect(115, 40, 165, 150);
    }

    class Knop implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel += 1;
            repaint();
        }
    }
    class Knopterug implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tafel -= 1;
            repaint();
        }
    }
}
