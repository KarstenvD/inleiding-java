package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijk11 extends Applet {
    TextField tekstvak;
    int tafel;
    public void init() {
        tekstvak = new TextField("",20);
        tekstvak.addActionListener(new Tekstvak());
        add(tekstvak);
    }
    public void paint(Graphics g) {
        int teller;
        int y = 50;
        int x = 125;
        int num;
        num = 0;
        int uitkomst = 0;
        for(teller = 0; teller < 10; teller++) {
            if(tafel > 0) {
                y += 20;
                num += 1;
                uitkomst = num * tafel;
                g.drawString("" + num + " x " + tafel + " = " + uitkomst, x, y);
                if (teller == 4) {
                    x = 200;
                    y = 50;
                }
            }
        }
        g.drawRect(115,40,165,150);
    }
    class Tekstvak implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            tafel = Integer.parseInt(s);
            repaint();
        }
    }
}
